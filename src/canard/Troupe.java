package canard;

import java.util.ArrayList;
import java.util.List;

public class Troupe implements Cancaneur {

	private Observable observable;
	private List<Cancaneur> troupeDeCancaneur;
	
	public Troupe() {
		troupeDeCancaneur = new ArrayList<>();
		observable = new Observable(this);
	}
	
	public void add(Cancaneur cancaneur) {
		troupeDeCancaneur.add(cancaneur);
	}
	
	@Override
	public void cancaner() {
		for (Cancaneur cancaneur : troupeDeCancaneur) {
			cancaneur.cancaner();
		}
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
