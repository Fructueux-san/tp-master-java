class DatabaseSingletonDemo {

  public static void main(String[] args) {
    System.out.println("MAIN");
    DatabaseSingleton db1 = DatabaseSingleton.getInstance();
    DatabaseSingleton db2 = DatabaseSingleton.getInstance();
    
    // Testons si c'est la même instance
    System.out.println("Db1 ===  Db2 ? : "  + (db1 == db2));

    System.out.println("Nom de la base de données 1: " + " " + db1.getName());
    System.out.println("Nom de la base de données 2: " + " " + db2.getName());

    db1.editRecord();
    db2.editRecord();
  }

  
}
