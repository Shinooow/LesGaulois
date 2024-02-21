package village;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	

	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMax];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[nbVillageois] = gaulois;
		this.nbVillageois ++;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return this.villageois[numero];
	}
	
	public void afficherVillageois() {
		if(this.chef != null) {
			System.out.println("Dans le village du chef " + this.chef.getNom() + " vivent les légendaires gaulois : ");
		}
		for(int i=0; i<this.nbVillageois; i++) {
			System.out.println("- " + this.villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles", 30);
		// Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
	
}
