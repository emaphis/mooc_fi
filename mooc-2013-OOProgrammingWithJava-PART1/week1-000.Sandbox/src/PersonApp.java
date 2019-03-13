
public class PersonApp {

    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 24);

        System.out.println(pekka);

        Person person = pekka;
        person.becomeOlder(25);

        System.out.println(pekka);
 
        pekka = new Person("Pekka Mikkola", 24);
        System.out.println(pekka);

        person = null;
        System.out.println(person);
    }
}
