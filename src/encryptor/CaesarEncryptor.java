package encryptor;

import cipher.CaesarCipher;

public class CaesarEncryptor extends BaseEncryptor {
    public CaesarEncryptor() {
        cipherMethod = new CaesarCipher();
    }
}
