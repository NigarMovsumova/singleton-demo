package az.demo.ls;

public class Credential {

    private static Credential credential;

    private Credential() {
        System.out.println("Instance of a class is created");
    }

    public static Credential getCredential(){

        if(credential==null){
            credential= new Credential();
        }

        return credential;
    }

}
