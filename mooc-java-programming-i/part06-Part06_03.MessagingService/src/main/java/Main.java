
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService service = new MessagingService();
        service.add(new Message("Charley", "Hello, I'm fine, hwo are you?"));
        for(Message msg : service.getMessages()) {
            System.out.println(msg);
        }

    }
}
