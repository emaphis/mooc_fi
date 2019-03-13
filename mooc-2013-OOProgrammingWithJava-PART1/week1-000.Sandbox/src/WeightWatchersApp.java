
public class WeightWatchersApp {
    public static void main(String[] args) {
        Person matti = new Person("Matti");
        matti.setWeight(86);
        matti.setHeight(172);

        Person juhana = new Person("Juhana");
        juhana.setWeight(64);
        juhana.setHeight(172);

        WeightWatchersAssociation kumpulasWeight = new WeightWatchersAssociation(25);
        
        if ( kumpulasWeight.isAcceptedAsMember(matti) ) {
            System.out.println( matti.getName() + " is accepted as a member");
        } else {
            System.out.println( matti.getName() + " is not accepted as a member");
        }

        if ( kumpulasWeight.isAcceptedAsMember(juhana) ) {
            System.out.println( juhana.getName() + " is accepted as a memberksi");
        } else {
            System.out.println( juhana.getName() + " is not accepted as a member");
        }

    }
}
