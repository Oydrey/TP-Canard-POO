package canard;

public class AdaptateurDOie implements Cancaneur {

	private Observable observable;
	private Oie oie;
	
	public AdaptateurDOie(Oie oie) {
		this.oie = oie;
		observable = new Observable(this);
	}
	
	public void cancaner() {
		oie.cacarder();		
	}

	public void enregistrerObservateur(Observateur observateur) {
		observable.enregistrerObservateur(observateur);
	}

	public void notifierObservateurs() {
		observable.notifierObservateurs();
	}

}
