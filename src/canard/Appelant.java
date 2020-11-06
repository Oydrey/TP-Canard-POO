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
