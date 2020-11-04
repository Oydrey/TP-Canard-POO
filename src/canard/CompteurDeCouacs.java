package canard;

public class CompteurDeCouacs implements Cancaneur {

	private Cancaneur cancaneur;
	private static int nombreDeCouacs;
	
	public CompteurDeCouacs(Cancaneur cancaneur) {
		this.cancaneur = cancaneur;
		nombreDeCouacs = 0;
	}
	
	public void cancaner() {
		cancaneur.cancaner();
		nombreDeCouacs++;
	}

	public static int getCouacs() {
		return nombreDeCouacs;
	}
	
}
