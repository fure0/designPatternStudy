public class Singleton {

  private static Singleton instance;
    
  private Singleton(){}
  
  public static Singleton getInstance(){
      if(instance == null){
          instance = new Singleton();
      }
      return instance;
  }
}

/*
이 방식으로 구현할 경우 1, 2번에서 안고 있던 문제(사용하지 않았을 경우에는 인스턴스가 낭비)에 대해 어느 정도 해결책이 됩니다. 

그러나 이 경우에도 문제점이 있습니다. 그건 바로 multi-thread 환경에서 동기화 문제입니다.

만약 인스턴스가 생성되지 않은 시점에서 여러 쓰레드가 동시에 getInstance()를 호출한다면 예상치 못한 결과를 얻을 수 있을뿐더러, 

단 하나의 인스턴스를 생성한다는 싱글톤 패턴에 위반하는 문제점이 야기될 수 있습니다.

그렇기에 이 방법으로 구현을 해도 괜찮은 경우는 single-thread 환경이 보장됐을 때입니다.
*/