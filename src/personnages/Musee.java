package personnages;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee = 0;

	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophees[nbTrophee] = new Trophee(gaulois, equipement);
		nbTrophee++;
	}

	public String extraireInstructionsCaml() {
		String chaineCaml = "let musee = [\n";
		for (int i = 0; i < nbTrophee; i++) {
			chaineCaml += "\t\"" + trophees[i].donnerNom() + "\", \"" + trophees[i].getEquipement() + "\"";
			if (i != nbTrophee - 1) {
				chaineCaml += ";\n";
			}
		}
		chaineCaml += "\n]\n";
		return chaineCaml;
	}

}
