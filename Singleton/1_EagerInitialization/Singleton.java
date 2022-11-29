public class Singleton {
  
  private static final Singleton instance = new Singleton();

  // private constructor to avoid client applications to use constructor
  private Singleton() {}

  public static Singleton getInstance() {
    return instance;
  }
}

/*
Eager Initialization

이는 싱글톤 클래스의 인스턴스를 클래스 로딩 단계에서 생성하는 방법입니다.

그러나 어플리케이션에서 해당 인스턴스를 사용하지 않더라도 인스턴스를 생성하기 때문에 자칫 낭비가 발생할 수 있습니다.

이 방법을 사용할 때는 싱글톤 클래스가 다소 적은 리소스를 다룰 때여야 합니다.

File System, Database Connection 등 큰 리소스들을 다루는 싱글톤을 구현할 때는 
위와 같은 방식보다는 getInstance() 메소드가 호출될 때까지 싱글톤 인스턴스를 생성하지 않는 것이 더 좋습니다.

게다가 Eager Initializaion은 Exception에 대한 Handling도 제공하지 않습니다.
*/