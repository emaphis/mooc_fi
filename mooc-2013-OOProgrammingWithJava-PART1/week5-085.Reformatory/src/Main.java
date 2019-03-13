
public class Main {

    public static void main(String[] args) {
        // write here test code 
        
        Reformatory ref = new Reformatory();
        Person h = new Person("Pekka", 33, 175, 78);
        ref.feed(h);
        System.out.println( h.getWeight() );
        //;;expected:<79> but was:<78>
    }
}
