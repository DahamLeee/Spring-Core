package hello.core.singleton;

public class SingletonService {

    // static 을 선언하면 클래스 level 에 올라가기 때문에 한 개만 존재하게 된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    // private 생성자!!
    private SingletonService() {

    }

    public void login() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
