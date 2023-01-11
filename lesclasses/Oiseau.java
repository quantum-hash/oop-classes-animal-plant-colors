package lesclasses; // regroupement des classes et ajout au package

/**************************** Oiseau extends Animal ***************************/
public class Oiseau extends Animal {
  private int longueur_des_ailes; // Déclaration d'un attribut de type int nommé "longueur_des_ailes"

  /* Déclaration du constructeur de la classe Oiseau, qui prend en paramètre deux String et un int*/
  public Oiseau(String son, String identity, int longueur_des_ailes) {
    super(son, identity); // appelle le constructeur de la classe parente (Animal)
    this.longueur_des_ailes = longueur_des_ailes; // Affectation de la longueur des ailes à l'attribut longueur_des_ailes de l'objet en cours de création
  }
  @Override
  public String identity() { // Déclaration de la méthode identity, qui ne prend pas de paramètres et qui renvoie l'identité
    return Couleur.JAUNE+identity+Couleur.RESET;
  }
  @Override
  public String toString() { // Déclaration de la méthode toString, qui ne prend pas de paramètres et qui renvoie un String
    return "Je suis un animal. Je suis un oiseau.  Je suis un " + identity() + ". Mon son est " + this.son + ". Longueur de mes ailes : " + Couleur.BLEU+this.longueur_des_ailes + " mètres"+Couleur.RESET ;
  }
}
