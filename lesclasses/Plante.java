package lesclasses; // regroupement des classes et ajout au package

/********************************* Class Plante *******************************/
public class Plante {

  public String identity;  // Déclaration d'un attribut de type String nommé "identity"

  /* Déclaration du constructeur de la classe Plante, qui prend en paramètre un String */
  public Plante(String identity) {

    // Affectation de la valeur du paramètre identity à l'attribut identity de l'objet en cours de création
    this.identity = Couleur.VERT+identity+Couleur.RESET;
  }

  public String toString() {
    // Déclaration de la méthode toString, qui ne prend pas de paramètres et qui renvoie un String

    return "Je suis une plante : " + this.identity;
    // Renvoi d'une chaîne de caractères incluant la valeur de l'attribut identity de l'objet en cours d'utilisation
  }
}
