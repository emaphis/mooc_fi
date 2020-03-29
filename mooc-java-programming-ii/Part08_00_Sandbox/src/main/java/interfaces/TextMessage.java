/*
 * Week 9 Example
 */
package interfaces;

/**
 *
 * @author emaphis
 */
public class TextMessage implements Readable {
    private String sender;
    private String content;

    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String read() {
        return content;
    }

}
