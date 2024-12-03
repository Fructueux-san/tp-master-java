
class DatabaseSingleton {

  private String name;
  private int record;
  private static DatabaseSingleton instance;

  private DatabaseSingleton(){
    this.name = "Ma super base de données.";
    this.record = 0;
  };


  public static DatabaseSingleton getInstance() {
    if (instance == null) {
      instance = new DatabaseSingleton();
    }
    return instance;
  }
  public String getName() {
    return this.name;
  }

  public void editRecord() {
    this.record++;
    System.out.println("Enregistrement "+ this.record + " modifié. ");
  }
}
