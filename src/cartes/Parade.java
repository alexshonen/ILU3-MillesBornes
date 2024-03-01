package cartes;

public class Parade extends Bataille {

	public Parade(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		switch(super.getType()) {
		
			case FEU:
				return "Feu Vert : Recouvre la carte 'Feu rouge'\n";
			
			case ESSENCE:
				return "Essence : Recouvre la carte 'Panne d'essence'\n";
				
			case CREVAISON:
				return "Roue de Secours : Recouvre la carte 'Crevaison' \n";
				
			case ACCIDENT:
				return "Réparations : Recouvre la carte 'Accident'\n";
		}
		return null;
	}
}
