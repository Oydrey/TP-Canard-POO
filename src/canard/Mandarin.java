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