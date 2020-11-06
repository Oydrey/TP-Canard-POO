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

	public void enregistrerObservateur(Observateur observateur) {
		observable.enregistrerObservateur(observateur);
	}

	public void notifierObservateurs() {
		observable.notifierObservateurs();
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
		cancaneur.accept(visitor);
	}
	
}
