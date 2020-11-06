package canard;

public class CanardEnPlastique implements Cancaneur {
	
	private Observable observable;
	
	public CanardEnPlastique() {
		observable = new Observable(this);
	}
	
	public void cancaner() {
		System.out.println("Couic");
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
