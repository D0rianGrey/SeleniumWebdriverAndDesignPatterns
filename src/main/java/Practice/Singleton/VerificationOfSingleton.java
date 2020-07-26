package Practice.Singleton;

public class VerificationOfSingleton {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.x); //10
        obj1.x = 20;
        System.out.println(obj1.x); //20
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.x); //20
    }
}
