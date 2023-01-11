package lesclasses; // regroupement des classes et ajout au package

/************************** Mammifere hérite de Animal **************************/
public class Mammifere extends Animal {
  private int temps_gestation; // Déclaration d'un attribut de type int nommé "temps_gestation"

  /* Déclaration du constructeur de la classe Mammifere, qui prend en paramètre deux String et un int*/
  public Mammifere(String son, String identity, int temps_gestation) {
    super(son, identity); // appelle le constructeur de la classe parente (Animal)
    this.temps_gestation = temps_gestation; // Affectation de la durée de gestation à l'attribut temps_gestation de l'objet en cours de création
  }

  @Override
  public String identity() { // Déclaration de la méthode identity, qui ne prend pas de paramètres et qui renvoie l'identité
    return Couleur.JAUNE+identity+Couleur.RESET;   //this.getClass().getName();
  }
  @Override
  public String toString() { // Déclaration de la méthode toString, qui ne prend pas de paramètres et qui renvoie un String
    return "Je suis un animal. Je suis un mammifère. Je suis un " + identity() + ". Mon son est " + this.son + ". Durée gestation : " +  Couleur.BLEU+this.temps_gestation+Couleur.RESET ;
  }
}
