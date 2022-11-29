public class Singleton {

  private static Singleton instance;
    
  private Singleton(){}
  
  public static Singleton getInstance() {
    if(instance == null){
        synchronized (Singleton.class) {
            if(instance == null){
                instance = new Singleton();
            }
        }
    }
    return instance;
  }
}

/*
그래서 고안된 방식이 double checked locking 입니다.

이는 getInstance() 메소드 수준에 lock을 걸지 않고 instance가 null일 경우에만 synchronized가 동작하도록 합니다.
*/