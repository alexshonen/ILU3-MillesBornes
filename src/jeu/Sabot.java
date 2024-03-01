package jeu;

import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

public class Sabot implements Iterator<Carte>{
	private Carte cartes[];
	private int nbCartes;
	private int indiceIterateur = 0;
	private boolean nextEffectue = false;

	public Sabot(Carte[] cartes, int nbCartes) {
		cartes = new Carte[110];
		this.nbCartes = nbCartes;
	}
	
	public boolean estVide() {
		if (nbCartes == 0) {
			return true;
		}
		return false;
	}
	
	public void ajouterCarte(Carte nouvelleCarte) throws ArrayIndexOutOfBoundsException{
		if (nbCartes >= cartes.length)
			throw new ArrayIndexOutOfBoundsException("Le sabot est plein !");
		else {
			cartes[nbCartes] = nouvelleCarte;
			nbCartes++;
		}
			
	}
	
	public void ajouterFamilleCarte(Carte[] nouvellesCartes) {
		for(int i = 0; i < nouvellesCartes.length; i++) {
			for(int j = 0; j < nouvellesCartes[i].getNombre(); j++) {
				ajouterCarte(nouvellesCartes[i]);
			}
		}
	}
	
	public boolean hasNext() {
		return indiceIterateur < nbCartes;
	}
	
	public Carte next() {
		if(hasNext()) {
			Carte carte = cartes[indiceIterateur];
			indiceIterateur++;
			nextEffectue = true;
			return carte;
		}
		else {
			throw new NoSuchElementException();
		}
	}
	
	public void remove() {
		if (nbCartes < 1 || !nextEffectue) {
			throw new IllegalStateException();
		}
		for(int i = indiceIterateur - 1; i < nbCartes - 1; i++) {
			cartes[i] = cartes[i+1];
		}
		nextEffectue = false;
		indiceIterateur--;
		nbCartes--;
	}
	
}
