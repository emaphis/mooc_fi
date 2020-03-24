package equals;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class MessageApp {

    static void example1() {

        Message sms = new Message("SMS");
        Message mms = new Message("MMS");

        System.out.println(sms.equals(sms));
        System.out.println(sms.equals(mms));

        ArrayList<Message> messages = new ArrayList<>();
        if (!messages.contains(sms)) {
            messages.add(sms);
        }

        if (!messages.contains(sms)) {
            messages.add(sms);
        }

        if (!messages.contains(new Message("SMS"))) {
            messages.add(sms);
        }

        System.out.println(messages.size());
    }

    public static void main(String[] args) {
        example1();
    }
}
