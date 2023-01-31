public class Person {
    String nom;
    int age;
    double salaire;

    //constructeur sans parametre
    public Person() {
        nom = "Mia";
        age = 25;
        salaire = 20000.5;
    }

    //constructeur avec parametre
    public Person(String pNom, int pAge, double pSalaire) {
        nom = pNom;
        age = pAge;
        salaire = pSalaire;
    }

    //constructeur qui prend en compte que deux parametre

    public Person(String pNom, int pAge){
        nom = pNom;
        age = pAge;
        salaire =-1;
    }


    public void displayInfo(){
        if (salaire == -1){
            System.out.println("nom: " +nom );
            System.out.println("age: " +age);
            System.out.println("salaire non defini");
            return;
        }
        System.out.println("nom: " +nom );
        System.out.println("age: " +age);
        System.out.println("salaire: " + salaire);
    }
}
