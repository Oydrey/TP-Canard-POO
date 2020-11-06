package canard;

public class Appelant implements Cancaneur {
	
	private Observable observable;
	
	public Appelant() {
		observable = new Observable(this);
	}
	
	public void cancaner() {
		System.out.println("Couincouin");
		notifierObservateurs();
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
