package lesclasses; // regroupement des classes et ajout au package


/******************** Interfaces ICarnivore & IHerbivore & IOmnivore *******************/
interface ICarnivore { // L'interface ICarnivore définit les comportements attendus d'une espèce carnivore
  void mange(Animal a); // La méthode mange prend en paramètre un animal à manger
}

interface IHerbivore { // L'interface IHerbivore définit les comportements attendus d'une espèce herbivore
  void mange(Plante p); // La méthode mange prend en paramètre une plante à manger
}

interface IOmnivore { // L'interface IOmnivore définit les comportements attendus d'une espèce omnivore
  void mange(Animal a, Plante p); // La méthode mange prend en paramètre un animal et une plante à manger
}

/******************************** Class Animal ********************************/
public class Animal implements IHerbivore, ICarnivore, IOmnivore {
  public String son;   // Déclaration d'un attribut de type String nommé "son"
  public String identity;  // Déclaration d'un attribut de type String nommé "identity"

  /* Déclaration du constructeur de la classe Animal, qui prend en paramètre deux String */
  public Animal(String son, String identity) {
    this.son = Couleur.ROUGE+son+Couleur.RESET; // Affectation du son à l'attribut son de l'objet en cours de création
    this.identity = identity; // Affectation de l'identité à l'attribut identity de l'objet en cours de création
  }

  public String identity() { // Déclaration de la méthode identity, qui ne prend pas de paramètres et qui renvoie l'identité
    return Couleur.JAUNE+identity+Couleur.RESET;   //this.getClass().getName();
  }

  public String toString() { // Déclaration de la méthode toString, qui ne prend pas de paramètres et qui renvoie un String
    return "Je suis un " + identity() + ". Mon son est " + this.son;
  }

  ///////////////////////////////////MEME NOM mange() [OVERLOADING]\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  /*Fonction qui prend en paramètre une variable de type "Plante" appelée "p". La fonction "void" ne retourne aucune valeur. */
  public void mange(Plante p){
    if (this.identity.equals("lapin")) { //Vérifie si l'attribut identity de l'objet est égale à la chaîne de caractères "lapin".
      System.out.println("Je"+ Couleur.GRAS+" mange " +Couleur.RESET + "des plantes : " + p.identity + " car je suis un : " + identity() + " et donc herbivore.");
    }

    else if (this.identity.equals("homme")) { //Vérifie si l'attribut identity de l'objet est égale à la chaîne de caractères "homme".
      System.out.println("Je"+ Couleur.GRAS+" mange " +Couleur.RESET + "des plantes : " + p.identity + " car je suis un : " + identity() + " et donc omnivore.");
    }
    else { //Si les deux conditions précédentes sont fausses alors exéction de l'instruction qui suit.
      System.out.println("Je"+ Couleur.GRAS+" ne mange pas " +Couleur.RESET + "des plantes : " + p.identity + " car je suis un : " + identity());
    }
  }

  /*Fonction qui prend en paramètre une variable de type "Animal" appelée "a". La fonction "void" ne retourne aucune valeur. */
  public void mange(Animal a){
    if (this.identity.equals("chien") || this.identity.equals("aigle")) {  //Vérifie si l'attribut identity de l'objet est égale à la chaîne de caractères "chien" ou "aigle".
      System.out.println("Je"+ Couleur.GRAS+" mange " +Couleur.RESET + "des animaux : " + Couleur.JAUNE+a.identity+Couleur.RESET + " car je suis un : " + identity() + " et donc carnivore.");
    }
    else if (this.identity.equals("homme")) { //Vérifie si l'attribut identity de l'objet est égale à la chaîne de caractères "homme".
      System.out.println("Je"+ Couleur.GRAS+" mange " +Couleur.RESET + "des animaux : " + Couleur.JAUNE+a.identity+Couleur.RESET + " car je suis un : " + identity() + " et donc omnivore.");
    }
    else { //Si les deux conditions précédentes sont fausses alors exéction de l'instruction qui suit.
      System.out.println("Je"+ Couleur.GRAS+" ne mange pas " +Couleur.RESET + "des animaux : " + Couleur.JAUNE+a.identity+Couleur.RESET +  " car je suis un : " + identity());
    }
  }

  /*Fonction qui prend en paramètre une variable de type "Animal" appelée "a" et de type "Plante" appelée "p". La fonction "void" ne retourne aucune valeur. */
  public void mange(Animal a, Plante p) {
    if (this.identity.equals("homme")) {  //Vérifie si l'attribut identity de l'objet est égale à la chaîne de caractères "homme".
      System.out.println("Je"+ Couleur.GRAS+" mange " +Couleur.RESET + "des animaux : " + Couleur.JAUNE+a.identity+Couleur.RESET + " et des plantes : "+ p.identity +" car je suis un : " + identity() + " et donc omnivore.");
    }
    else { //Si la condition précédente est fausse alors exécution de l'instruction qui suit.
      System.out.println("Je ne suis pas omnivore.");
    }
  }
}
