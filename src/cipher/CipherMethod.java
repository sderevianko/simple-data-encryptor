package cipher;

public interface CipherMethod<T> {
    String doEncryption(String message, T key);
}
