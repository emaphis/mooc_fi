
public class WeightWatchersApp {

    public static void testAssociation() {
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

    public static void testAssociationList() {
        WeightWatchersAssociation weightWatcher = new WeightWatchersAssociation("Kumpulan paino", 25);

        Person matti = new Person("Matti");
        matti.setWeight(86);
        matti.setHeight(180);
        weightWatcher.addAsMember(matti);

        Person juhana = new Person("Juhana");
        juhana.setWeight(64);
        juhana.setHeight(172);
        weightWatcher.addAsMember(juhana);

        Person harri = new Person("Harri");
        harri.setWeight(104);
        harri.setHeight(182);
        weightWatcher.addAsMember(harri);

        Person petri = new Person("Petri");
        petri.setWeight(112);
        petri.setHeight(173);
        weightWatcher.addAsMember(petri);

        System.out.println( weightWatcher );
    }
 
    public static void main(String[] args) {
        //testAssociation();
        testAssociationList();

    }
}
