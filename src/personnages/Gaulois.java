package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement tropheesBataille[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheesBataille != null && i < tropheesBataille.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesBataille[i];
		}
	}

	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void faireUneDonnation(Musee musee) {
		if (nbTrophees != 0) {
			String texte = "Je donne au musee tous mes trophees : ";
			for (int i = 0; i < nbTrophees; i++) {
				texte += "\n- " + trophees[i];
				musee.donnerTrophees(this, trophees[i]);
				trophees[i] = null;
			}
			nbTrophees = 0;
			parler(texte);
		}
	}



	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 5);
		System.out.println(asterix);
	}
	
}