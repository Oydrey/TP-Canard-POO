package canard;

public class Mandarin implements Cancaneur {
	
	private Observable observable;
	
	public Mandarin() {
		observable = new Observable(this);
	}
	
	public void cancaner() {
		System.out.println("Coincoin");
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