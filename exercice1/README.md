# Cours Java MASTER

## Design pattern Singleton en JAVA

Enoncé de l'exercice : 
### Exercice 1 : Journalisation d’un compte bancaire
Afin de mettre en pratique le pattern Singleton en Java, prenons un court exemple
d’implémentation dans le milieu bancaire. Tout d’abord nous allons concevoir une classe
**CompteBancaire** qui permet de déposer ou retirer de l’argent sur un compte. Mais nous
souhaiterions pouvoir af cher les opérations (_effectuées ou refusées_) dans la console en cas de
litige (il serait aussi possible d’utiliser en sortie un fichier texte). Cette petite application devra
rapidement évoluer et il est fort probable que par la suite d’autres classes soient concernées par
cette journalisation. Pour cela, nous allons implémenter une classe distincte nommée **Journalisation**
reprenant le pattern Singleton. Ainsi nous allons garantir que notre programme va utiliser une seule
et même instance de la classe Journalisation. Une troisième classe intitulée **Main** permettra
d’exécuter l’application et d’obtenir un résultat en console.

_____________________________________
|          Journalisation           |
-------------------------------------
|- uniqueInstance: Journalisation   |-----------
|- log : string                     |          | + uniqueInstance
-------------------------------------<----------
|- Singleton()                      |
|+ getInstance(): Journalisation    |
|+ ajouterLog(log: String):         |
|+ afficherLog(log: String):        |
-------------------------------------


_____________________________________
|          CompteBancaire           |
-------------------------------------
|- numero : int                     |
|- solde : double                   |
-------------------------------------
|+ CompteBancaire()                 |
|+ deposerArgent(depot: double):    |
|+ retirerArgent(retrait: double):  |
-------------------------------------


Sur ce diagramme UML, on retrouve les deux classes Jounalisation et CompteBancaire. On
remarque aisément que la classe Journalisation est basée sur le pattern Singleton. En effet, on
trouve un attribut statique de type Singleton, un constructeur déclaré en privé et une méthode
statique servant de pseudo-constructeur. Il existe aussi deux méthodes propres à l’utilisation de
cette classe que sont ajouterLog(string) et af cherLog().La classe CompteBancaire correspond à un compte. Celui-ci possède un numéro (identi ant) et un
solde. Il est possible de déposer de l’argent ou d’en retirer grâce aux méthodes
deposerArgent(double) et retirerArgent(double). De plus, certaines véri cations sont effectuées
notamment pour éviter un découvert (notre banque ne fait pas crédit). Ces deux dernières
méthodes utilisent la classe Journalisation pour tracer les opérations. On remarque les appels à la
méthode getInstance() pour obtenir une instance unique de cette classe.
