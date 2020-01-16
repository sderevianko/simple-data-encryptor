package encryptor;

import cipher.AesCipher;

public class AesEncryptor extends BaseEncryptor {
    public AesEncryptor() {
        cipherMethod = new AesCipher();
    }
}
