package cipher;

public class VigenereCipher implements CipherMethod<String> {
    @Override
    public String doEncryption(String message, String key) {
        final StringBuilder encrypted = new StringBuilder();
        final char startingCharacter = 'A';
        final int alphabetPower = 26;
        final int numberMessage = message.length();
        final int numberKey = key.length();
        final char[] messageArray = message.toCharArray();
        final char[] keyArray = key.toCharArray();
        int keyIndex = 0;
        for (int messageIndex = 0; messageIndex < numberMessage; ++messageIndex) {
            int newAlphabetPosition = startingCharacter + ((messageArray[messageIndex] + keyArray[keyIndex]) % alphabetPower);
            char newCharacter = (char) (newAlphabetPosition);
            encrypted.append(newCharacter);
            keyIndex = ++keyIndex % numberKey;
        }
        return encrypted.toString();
    }
}
