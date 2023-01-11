import lesclasses.*; // importation de l'intégralité des classes du package 

public class main_pack {
  public static void main(String[] args) {
    // Activer les couleurs dans la console CMD
    try {Process process = Runtime.getRuntime().exec("reg add HKEY_CURRENT_USER\\Console /v VirtualTerminalLevel /t REG_DWORD /d 0x00000001 /f");} // Changement de la valeur dans le registre
    // Pour desactiver --> try {Process process = Runtime.getRuntime().exec("reg add HKEY_CURRENT_USER\\Console /v VirtualTerminalLevel /t REG_DWORD /d 0x00000000 /f");}
    catch (Exception e) {e.printStackTrace();} // Affichage de l'exception

    // Création de deux plantes : herbe et carotte
    Plante herbe = new Plante("herbe");
    Plante carotte = new Plante("carotte");

    // Création de trois mammifères : lapin, chien et homme et d'un oiseau : aigle
    Oiseau aigle = new Oiseau("l'hurlement", "aigle", 2);
    Mammifere lapin = new Mammifere("le glapissement", "lapin", 2);
    Mammifere chien = new Mammifere("l'aboiement", "chien", 6);
    Mammifere homme = new Mammifere("la parole", "homme", 9);

    System.out.print('\n'); //saut de ligne

    // Affichage des informations que retourne les objets des plantes et animaux créés
    System.out.println(herbe);
    System.out.println(carotte);
    System.out.println(aigle);
    System.out.println(lapin);
    System.out.println(chien);
    System.out.println(homme);

    System.out.print('\n'); //saut de ligne

    aigle.mange(herbe); // IHerbivore
    aigle.mange(lapin); // ICarnivore

    lapin.mange(herbe); // IHerbivore
    lapin.mange(aigle); // ICarnivore

    chien.mange(herbe); // IHerbivore
    chien.mange(lapin); // ICarnivore

    homme.mange(carotte); // IHerbivore
    homme.mange(lapin); // ICarnivore
    homme.mange(lapin, carotte); // IOmnivore

    System.out.print('\n'); //saut de ligne

    // Création d'un humain à l'aide de la classe Animal seulement
    Animal humain = new Animal("la parole.", "homme");
    System.out.println(humain);

  }
}
