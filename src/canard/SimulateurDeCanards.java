package canard;

public class SimulateurDeCanards {

	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		simulateur.simuler();
	}
	
	void simuler() {
		Cancaneur colvert = new Colvert();
		Cancaneur mandarin = new Mandarin();
		Cancaneur appelant = new Appelant();
		Cancaneur canardEnPlastique = new CanardEnPlastique();
		AdaptateurDOie canardOie = new AdaptateurDOie(new Oie());
		System.out.println("Simulateur de canards\n");
		simuler(colvert);
		simuler(mandarin);
		simuler(appelant);
		simuler(canardEnPlastique);
		simuler(canardOie);
	}
	
	void simuler(Cancaneur canard) {
		canard.cancaner();
	}

}
