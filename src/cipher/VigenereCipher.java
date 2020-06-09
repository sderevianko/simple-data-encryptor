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
        int newAlphabetPosition;
        char newCharacter;
        int keyIndex = 0;

        for (int messageIndex = 0; messageIndex < numberMessage; ++messageIndex) {
            if (((messageArray[messageIndex] <= 64) && (messageArray[messageIndex] >= 32)) || ((messageArray[messageIndex] <= 96) && (messageArray[messageIndex] >= 91)) || ((messageArray[messageIndex] <= 126) && (messageArray[messageIndex] >= 123))) {
                newAlphabetPosition = messageArray[messageIndex];
                newCharacter = (char) (newAlphabetPosition);
                encrypted.append(newCharacter);
            } else {
                newAlphabetPosition = startingCharacter + ((messageArray[messageIndex] + keyArray[keyIndex]) % alphabetPower);
                newCharacter = (char) (newAlphabetPosition);
                encrypted.append(newCharacter);
                keyIndex = ++keyIndex % numberKey;
            }
        }
        return encrypted.toString();
    }
}
