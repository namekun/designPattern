package singleton;

public class Singleton {
    // 인스턴스
    private static Singleton singletonInstance = new Singleton();

    // private 생성자
    private Singleton(){}

    // 접근용
    public static Singleton getSingleton(){
        return singletonInstance;
    }
}
