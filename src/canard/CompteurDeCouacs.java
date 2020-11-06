package canard;

public class CompteurDeCouacs implements Cancaneur {

	private Observable observable;
	private Cancaneur cancaneur;
	private static int nombreDeCouacs;
	
	public CompteurDeCouacs(Cancaneur cancaneur) {
		this.cancaneur = cancaneur;
		nombreDeCouacs = 0;
		observable = new Observable(cancaneur);
	}
	
	public void cancaner() {
		cancaneur.cancaner();
		nombreDeCouacs++;
	}

	public static int getCouacs() {
		return nombreDeCouacs;
	}

	@Override
	public void enregistrerObservateur(Observateur observateur) {
		observable.enregistrerObservateur(observateur);
	}

	@Override
	public void notifierObservateurs() {
		observable.notifierObservateurs();
	}
	
}
