package encryptor;

import cipher.CipherMethod;

public abstract class BaseEncryptor {
    protected CipherMethod cipherMethod;

    public String encrypt() {
        return cipherMethod.doEncryption();
    }
}
