package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	
	public Village(String nom, Chef chef) {
		this.nom = nom;
		this.chef = chef;
	}
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant (int numGaulois) {
		return villageois[numGaulois];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef " + chef.getNom() + " vivent les légendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}

	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
//		Le tableau possede 30 cases numerote de 0 a 29
		Chef chef = new Chef("Abraracourcix", 6, village);
		village.setChef(chef);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
	}
	
}