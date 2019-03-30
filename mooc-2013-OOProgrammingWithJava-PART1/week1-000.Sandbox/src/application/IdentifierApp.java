
package application;

import application.domain.Person;
import application.domain.Register;


public class IdentifierApp {

    static void testRegister() {
        Register personnel = new Register();
        personnel.add( new Person("Pekka", "221078-123X") );
        personnel.add( new Person("Jukka", "110956-326B") );

        System.out.println( personnel.get("280283-111A") );

        Person found = (Person) personnel.get("110956-326B");
        System.out.println( found.getName() );
    }

    public static void main(String[] args) {
        testRegister();
    }

}
