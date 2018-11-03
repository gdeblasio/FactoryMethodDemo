package factorymethoddemo;

public class Main {

    public static void main(String[] args) {
        Encryptor encryptor = new Sha256Encryptor();
        PersistedFile file = new PersistedFile("text.txt", "Hello World!", encryptor);
        file.persist();
        System.out.println(file.getContents() + " encrypted to " + file.getPath());
    }
    
}
