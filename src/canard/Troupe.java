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
	
	public void cancaner() {
		for (Cancaneur cancaneur : troupeDeCancaneur) {
			cancaneur.cancaner();
		}
	}

	public void enregistrerObservateur(Observateur observateur) {
		observable.enregistrerObservateur(observateur);
	}

	public void notifierObservateurs() {
		observable.notifierObservateurs();
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
		for (Cancaneur cancaneur : troupeDeCancaneur) {
			cancaneur.accept(visitor);
		}
	}

}
