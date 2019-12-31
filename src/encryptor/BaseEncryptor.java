package encryptor;

import cipher.CipherMethod;

public abstract class BaseEncryptor {
    protected CipherMethod cipherMethod;

    public <T> String encrypt(String message, T key) {
        return cipherMethod.doEncryption(message, key);
    }
}
