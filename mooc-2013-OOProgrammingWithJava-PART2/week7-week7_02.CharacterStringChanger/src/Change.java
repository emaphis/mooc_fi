
public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }


    public String change(String characterString) {
        char[] chars = new char[characterString.length()];
        for (int i = 0; i < characterString.length(); i++) {
            if (characterString.charAt(i) == fromCharacter)
               chars[i] = toCharacter;
            else
               chars[i] = characterString.charAt(i);
        }

        return new String(chars);
    }
}
