package canard;

public class SimulateurDeCanards {

	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		FabriqueDeCanardsAbstraite fabriqueDeCanards = new FabriqueDeCanards();
		simulateur.simuler(fabriqueDeCanards);
	}
	
	void simuler(FabriqueDeCanardsAbstraite fabriqueDeCanard) {
		/*Cancaneur colvert = fabriqueDeCanards.creerColvert();
		Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
		Cancaneur appelant = new CompteurDeCouacs(new Appelant());
		Cancaneur canardEnPlastique = new CompteurDeCouacs(new CanardEnPlastique());
		Cancaneur canardOie = new CompteurDeCouacs(new AdaptateurDOie(new Oie()));
		System.out.println("Simulateur de canards\n");
		simuler(colvert);
		simuler(mandarin);
		simuler(appelant);
		simuler(canardEnPlastique);
		simuler(canardOie);
		System.out.println("\nNous avons compté " + CompteurDeCouacs.getCouacs() + " couacs.");
		
		Troupe troupeDeCanards = new Troupe();
		troupeDeCanards.add(mandarin);
		troupeDeCanards.add(appelant);
		
		Troupe troupeDeColverts = new Troupe();
		Cancaneur colvert2 = new Colvert();
		Cancaneur colvert3 = new Colvert();
		troupeDeColverts.add(colvert2);
		troupeDeColverts.add(colvert3);
				
		troupeDeCanards.add(troupeDeColverts);
		System.out.println("\nSimulateur de canards : Toute la troupe");
		simuler(troupeDeCanards);
		System.out.println("\nSimulateur de canards : Troupe de colverts");
		simuler(troupeDeColverts);
		
		FabriqueDeCanardsAbstraite frabriqueDeCanards = new FabriqueDeCanards();
		Cancaneur colvert = fabriqueDeCanards.creerColvert();
		
		Cancanologue leCancanologue = new Cancanologue();
		
		colvert.enregistrerObservateur(leCancanologue);
		
		simuler(colvert);*/
		
		FabriqueDeCanardsAbstraite fabriqueDeCanards = new FabriqueDeComptage();
		Cancaneur colvert = fabriqueDeCanards.creerColvert();
		Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
		Cancaneur canardOie = new AdaptateurDOie(new Oie());
			
		Troupe sousTroupe = new Troupe();
		fabriqueDeCanards = new FabriqueDeCanards();
		sousTroupe.add(fabriqueDeCanards.creerColvert());
		sousTroupe.add(fabriqueDeCanards.creerMandarin());
		sousTroupe.add(fabriqueDeCanards.creerColvert());
			
		Troupe maTroupe = new Troupe();
		maTroupe.add(colvert);
		maTroupe.add(mandarin);
		maTroupe.add(canardOie);
		maTroupe.add(sousTroupe);
					
		Visitor unVisiteur = new VisitorCompteurNoeudFeuille();
		maTroupe.accept(unVisiteur);	
		System.out.println("Nb de noeuds  = "
				+ ((VisitorCompteurNoeudFeuille) unVisiteur).getNbNoeud());
		System.out.println("Nb de feuilles  = "
				+ ((VisitorCompteurNoeudFeuille) unVisiteur).getNbFeuille());


	}
	
	void simuler(Cancaneur canard) {
		canard.cancaner();
	}

}
