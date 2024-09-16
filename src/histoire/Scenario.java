package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix",5, 10);
		druide.parler("Je vais aller préparer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix", 8);
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		
//		RESULTAT exo 4.2.1:
//			Le gaulois Astérix : « Bonjour à tous»
//			Le romain Minus : « UN GAU... UN GAUGAU...»
//			Astérix envoie un grand coup dans la mâchoire de Minus
//			Le romain Minus : « Aïe»
//			Astérix envoie un grand coup dans la mâchoire de Minus
//			Le romain Minus : « Aïe»
//			Astérix envoie un grand coup dans la mâchoire de Minus
//			Le romain Minus : « J'abandonne...»

//		RESULTAT exo 4.2.2:
//		Le druide Panoramix : « Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10.»
//		Le druide Panoramix : « Je vais aller préparer une petite potion...»
//		Le druide Panoramix : « J'ai préparé une super potion de force 8.»
//		Le druide Panoramix : « Non, Obélix !... Tu n'auras pas de potion magique !»
//		Le gaulois Obélix : « Par Bélénos, ce n'est pas juste !»
//		Le gaulois Astérix : « Merci Druide, je sens que ma force est 8 fois décuplée.»
//		Le gaulois Astérix : « Bonjour»
//		Le romain Minus : « UN GAU... UN GAUGAU...»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « Aïe»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « Aïe»
//		Astérix envoie un grand coup dans la mâchoire de Minus
//		Le romain Minus : « J'abandonne...»

	}

}