
public class Main {

  public static void main(String[] args) {
    System.out.println("HELLO");
    Journalisation journal = Journalisation.getInstance();
    CompteBancaire cmpt1 = new CompteBancaire(1);

    cmpt1.deposerArgent(15000);
    System.out.println(cmpt1.getSolde());
    System.out.println(journal.afficherLog());
    
  }
}
