package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		switch(super.getType()) {
		
			case FEU:
				return "Feu rouge : Cette carte se place sur la pile "
						+ "de Bataille d’un adversaire qui roule. "
						+ "Elle l’empêche de poser de nouvelles cartes Bornes, "
						+ "jusqu’à ce qu’il recouvre cette attaque d’une carte Feu Vert.\n";
			
			case ESSENCE:
				return "Panne d'essence : Cette carte se place sur la pile de Bataille d’un adversaire qui "
						+ "roule. Elle l’empêche de poser de nouvelles cartes Bornes, "
						+ "jusqu’à ce qu’il recouvre cette attaque d’une carte Essence.\n";
				
			case CREVAISON:
				return "Crevaison : Cette carte se place sur la pile de Bataille d’un adversaire qui "
						+ "roule. Elle l’empêche de poser de nouvelles cartes Bornes, jusqu’à "
						+ "ce qu’il recouvre cette attaque d’une carte Roue de Secours.\n";
				
			case ACCIDENT:
				return "Accident : Cette carte se place sur la pile de Bataille d’un adversaire qui "
						+ "roule. Elle l’empêche de poser de nouvelles cartes Bornes, "
						+ "jusqu’à ce qu’il recouvre cette attaque d’une carte Réparations.\n";
		}
		return null;
	}
}
