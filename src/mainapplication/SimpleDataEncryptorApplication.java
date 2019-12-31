package mainapplication;

import encryptor.CaesarEncryptor;
import encryptor.VigenereEncryptor;

public class SimpleDataEncryptorApplication {

    public static void main(String[] args) {
        CaesarEncryptor caesarEncryptor = new CaesarEncryptor();
        System.out.println(caesarEncryptor.encrypt("adfm", 2));

        VigenereEncryptor vigenereEncryptor = new VigenereEncryptor();
        System.out.println(vigenereEncryptor.encrypt("adfm", "bacon"));
    }
}

