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

	public void enregistrerObservateur(Observateur observateur) {
		observable.enregistrerObservateur(observateur);
	}

	public void notifierObservateurs() {
		observable.notifierObservateurs();
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
