public class Singleton {

  private static Singleton instance;
    
  private Singleton(){}
  
  //static block initialization for exception handling
  static{
      try{
          instance = new Singleton();
      }catch(Exception e){
          throw new RuntimeException("Exception occured in creating singleton instance");
      }
  }
  
  public static Singleton getInstance(){
      return instance;
  }
}

/*
위와 같이 구현할 경우 싱글톤 클래스의 인스턴스를 생성할 때 발생할 수 있는 예외에 대한 처리를 할 수 있지만, 

Eager Initialization과 마찬가지로 클래스 로딩 단계에서 인스턴스를 생성하기 때문에 

여전히 큰 리소스를 다루는 경우에는 적합하지 않게 됩니다. 

*/