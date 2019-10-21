package az.demo.ls;

/**
 * Credential- Singleton class
 */
public class Credential {

    private static Credential credential;

    /**
     * Constructor is defined as private, because we will
     * violate the restriction of the class instantiation
     */
    private Credential() {
        System.out.println("Instance of a class is created");
    }

    /**
     * Method, that decides whether we need to call private constructor or
     * return existing instance of a class
     */
    public static Credential getCredential(){

        if(credential==null){
            credential= new Credential();
        }

        return credential;
    }

}
