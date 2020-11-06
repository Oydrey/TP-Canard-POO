package canard;

public class Cancanologue implements Observateur {

	public void actualiser(CouacObservable canard) {
		System.out.println("Cancanologue : " + canard + " vient de cancaner");
	}

}
