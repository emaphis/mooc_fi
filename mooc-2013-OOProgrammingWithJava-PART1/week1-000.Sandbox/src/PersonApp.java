
import java.util.ArrayList;


public class PersonApp {

    public static void testGetOlder() {
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

    public static void testOlderThan() {
        Person pekka = new Person("Pekka", 24);
        Person antti = new Person("Antti", 22);

        if (pekka.olderThan(antti)) {  //  same as pekka.olderThan(antti)==true
            System.out.println(pekka.getName() + " is older than " + antti.getName());
        } else {
            System.out.println(pekka.getName() + " isn't older than " + antti.getName());
        }
    }

    public static void testPersonsOnAList() {        
        ArrayList<Person> teachers = new ArrayList<Person>();

        // first we can take a person into a variable
        Person teacher = new Person("Juhana");
        // and then add it to the list
        teachers.add(teacher);

        // or we can create the object as we add it:
        teachers.add( new Person("Matti") );
        teachers.add( new Person("Martin") );

        System.out.println("teachers as newborns: ");
        for ( Person prs : teachers ) {
            System.out.println( prs );
        }

        for ( Person prs : teachers ) {
            prs.becomeOlder( 30 );
        }

        System.out.println("in 30 years: ");
        for ( Person prs : teachers ) {
            System.out.println( prs );
        }
    }

    public static void testBirthDate() {
        Person martin = new Person("Martin", 24, 4, 1983);

        Person juhana = new Person("Juhana", 17, 9, 1985);

        System.out.println( martin );
        System.out.println( juhana );
    }

    public static void main(String[] args) {
        //testGetOlder();
        //testOlderThan();
        //testPersonsOnAList();
        testBirthDate();
    }
}
