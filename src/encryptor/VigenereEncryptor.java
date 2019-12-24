package encryptor;

import cipher.VigenereCipher;

public class VigenereEncryptor extends BaseEncryptor {
    public VigenereEncryptor() {
        cipherMethod = new VigenereCipher();
    }
}
