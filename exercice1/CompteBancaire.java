public class CompteBancaire {
  private int numero;
  private double solde = 0;
  private Journalisation journal = Journalisation.getInstance();

  /*
   * Nous créons le compte en banque avec un numéro de compte
   * */
  public CompteBancaire(int numero) {
    // this.solde = soldeInitial;
    this.numero = numero;
    journal.ajouterLog("Création du compte "+this.numero+". Solde initial : "+this.solde);
  }

  public double deposerArgent(double depot) {
    solde += depot;
    journal.ajouterLog("Dépot de "+depot+" F CFA , nouveau solde:" + this.solde+ " sur le compte " + this.numero);
    return solde;
  }

  public double retirerArgent(double retrait) {
    if (retrait <= solde) {
      solde -= retrait; 
      journal.ajouterLog("Retrait de "+retrait+" sur le compte"+this.numero+". Nouveau solde : "+this.solde);
    }else {
      journal.ajouterLog("Tentative de retrait de "+retrait+" échouée. Solde insuffisant. Compte : " + this.numero);
      System.out.println("Solde insuffisant pour retrait, compte "+this.numero);
    }
    return solde;
  }

  public double getSolde() {
    return solde;
  }

}
