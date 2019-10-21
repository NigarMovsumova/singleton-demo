package az.demo.ls;

public class Main {

    public static void main(String[] args) {

        Credential credential= Credential.getCredential();

        /**
         * when we do a second try, constructor will not be called, so
         * "Instance of a class is created" will be printed only 1 time.
         * */
        Credential extraCredential = Credential.getCredential();
    }
}
