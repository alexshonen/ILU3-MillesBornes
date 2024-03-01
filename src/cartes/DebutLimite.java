package cartes;

public class DebutLimite extends Limite {

	public DebutLimite(int nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Limite de Vitesse : Cette carte se place sur la pile de Vitesse d’un adversaire. Elle "
				+ "l’empêche de poser des cartes Bornes supérieures à 50 km, jusqu’à ce qu’il recouvre cette "
				+ "attaque d’une carte Fin de Limite de Vitesse.\n";
	}
}
