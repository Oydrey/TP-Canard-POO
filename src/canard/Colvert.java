package canard;

public class Colvert implements Cancaneur {
	
	private Observable observable;
	
	public Colvert() {
		observable = new Observable(this);
	}
	
	public void cancaner() {
		System.out.println("Coincoin");
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
