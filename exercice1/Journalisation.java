import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Journalisation {
  private static Journalisation uniqueInstance;
  private String log;

  // Pour empêcher l'appel du constructueur hors de la classe.
  private Journalisation(){}


  // On fait les getters et setters

  public String afficherLog() {
    return this.log;
  }

  public void ajouterLog(String newLog) {
    String dateHeure = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    this.log = dateHeure + " " + newLog;
  }

  public static Journalisation getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Journalisation();
    }
    return uniqueInstance;
  }
}
