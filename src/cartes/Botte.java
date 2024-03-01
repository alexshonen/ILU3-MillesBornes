package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
		super(nombre, type);
	}
	
	@Override
	public String toString() {
		switch(super.getType()) {
		
			case FEU:
				return "Véhicule prioritaire : Une fois que vous avez posé cette Botte, vos "
						+ "adversaires ne peuvent plus vous attaquer avec une carte Feu Rouge\n";
			
			case ESSENCE:
				return "Citerne d'essence : Une fois que vous avez posé cette Botte, vos "
						+ "adversaires ne peuvent plus vous attaquer avec une carte Panne d’Essence. \n";
				
			case CREVAISON:
				return "Increvable : Une fois que vous avez posé cette Botte, vos "
						+ "adversaires ne peuvent plus vous attaquer avec une carte Crevaison \n";
				
			case ACCIDENT:
				return "As du volant : Une fois que vous avez posé cette Botte, vos "
						+ "adversaires ne peuvent plus vous attaquer avec une carte Accident\n";
		}
		return null;
	}

}
