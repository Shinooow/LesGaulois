package personnages;

public class Romain {
	private String nom;
	private int force;
	
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		//Invariant
		assert force > 0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		// précondition
		assert force > 0;
		int oldForce = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		// post condition la force à diminuer
		assert force < oldForce;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
			if (equipements[0].equals(equipement)) {
				System.out.println("Le soldat " + nom + " possède déjà un "
	+ equipement + ".");
			} else {
				ajouterEquipement(equipement);
			}
			break;

		default:
			ajouterEquipement(equipement);
			break;
		}
	}

	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
	}


	
	
}