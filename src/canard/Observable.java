package canard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements CouacObservable {

	private List<Observateur> observateurs = new ArrayList<>();
	private Cancaneur canard;
	
	public Observable(Cancaneur canard) {
		this.canard = canard;
	}
	
	public void enregistrerObservateur(Observateur observateur) {
		observateurs.add(observateur);		
	}

	public void notifierObservateurs() {
		Iterator<Observateur> iterateur = observateurs.iterator();
		
		while (iterateur.hasNext()) {
			Observateur observateur = iterateur.next();
			observateur.actualiser(canard);
		}
	}
	
}
