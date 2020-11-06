package canard;

public class VisitorCompteurNoeudFeuille implements Visitor {

	private int nbNoeud;
	private int nbFeuille;
	
	public int getNbNoeud() {
		return nbNoeud;
	}
	
	public int getNbFeuille() {
		return nbFeuille;
	}
	
	public void visit(Troupe t) {
		nbNoeud++;	
	}

	public void visit(Colvert c) {
		nbFeuille++;
	}
	
	public void visit(Mandarin c) {
		nbFeuille++;
	}

	public void visit(Appelant c) {
		nbFeuille++;
	}

	public void visit(CanardEnPlastique c) {
		nbFeuille++;
	}

	public void visit(AdaptateurDOie c) {
		nbFeuille++;
	}

	public void visit(CompteurDeCouacs c) {
		nbNoeud++;
	}

	public void visit(Visitable c) {
		System.out.println("classe pas encore gérée");
	}

}
