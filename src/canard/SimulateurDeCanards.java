package canard;

public class SimulateurDeCanards {

	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		simulateur.simuler();
	}
	
	void simuler() {
		Cancaneur colvert = new CompteurDeCouacs(new Colvert());
		Cancaneur mandarin = new CompteurDeCouacs(new Mandarin());
		Cancaneur appelant = new CompteurDeCouacs(new Appelant());
		Cancaneur canardEnPlastique = new CompteurDeCouacs(new CanardEnPlastique());
		Cancaneur canardOie = new CompteurDeCouacs(new AdaptateurDOie(new Oie()));
		System.out.println("Simulateur de canards\n");
		simuler(colvert);
		simuler(mandarin);
		simuler(appelant);
		simuler(canardEnPlastique);
		simuler(canardOie);
		System.out.println("\nNous avons compté " + CompteurDeCouacs.getCouacs() + " couacs.");
	}
	
	void simuler(Cancaneur canard) {
		canard.cancaner();
	}

}
