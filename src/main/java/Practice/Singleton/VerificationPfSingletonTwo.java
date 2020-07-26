package Practice.Singleton;

public class VerificationPfSingletonTwo {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.x);
    }
}
