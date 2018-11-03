package factorymethoddemo;

import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Encryptor {
    public abstract EncryptionAlgorithm getEncryptionAlgorithm();
    
    public void writeToDisk(String filename, String plaintext) {
        try {
            EncryptionAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
            String cyphertext = encryptionAlgorithm.encrypt(plaintext);
            
            FileOutputStream fos = new FileOutputStream(filename);
            fos.write(cyphertext.getBytes());
        } catch (IOException e) {
            // ...
        }
    }
    
}
