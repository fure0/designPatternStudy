package BuilderPattern;

public class TestBuilderPattern {
 
  public static void main(String[] args) {
    Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
            .setBluetoothEnabled(true)
            .setGraphicsCardEnabled(true)
            .build();
  }

}

/*
빌더 패턴은 많은 Optional한 멤버 변수(혹은 파라미터)나 지속성 없는 상태 값들에 대해 처리해야 하는 문제들을 해결합니다.
예를 들어, 팩토리 패턴이나 추상 팩토리 패턴에서는 생성해야하는 클래스에 대한 속성 값이 많을 때 아래와 같은 이슈들이 있습니다.

1. 클라이언트 프로그램으로부터 팩토리 클래스로 많은 파라미터를 넘겨줄 때 타입, 순서 등에 대한 관리가 어려워져 에러가 발생할 확률이 높아집니다.
2. 경우에 따라 필요 없는 파라미터들에 대해서 팩토리 클래스에 일일이 null 값을 넘겨줘야 합니다.
3. 생성해야 하는 sub class가 무거워지고 복잡해짐에 따라 팩토리 클래스 또한 복잡해집니다.

빌더 패턴은 이러한 문제들을 해결하기 위해 별도의 Builder 클래스를 만들어 필수 값에 대해서는 생성자를 통해, 
선택적인 값들에 대해서는 메소드를 통해 step-by-step으로 값을 입력받은 후에 build() 메소드를 통해 
최종적으로 하나의 인스턴스를 리턴하는 방식입니다.

빌더 패턴을 구현하는 방법은 아래와 같습니다.

1. 빌더 클래스를 Static Nested Class로 생성합니다. 이때, 관례적으로 생성하고자 하는 클래스 이름 뒤에 Builder를 붙입니다. 
예를 들어, Computer 클래스에 대한 빌더 클래스의 이름은 ComputerBuilder 라고 정의합니다.

2. 빌더 클래스의 생성자는 public으로 하며, 필수 값들에 대해 생성자의 파라미터로 받습니다.

3. 옵셔널한 값들에 대해서는 각각의 속성마다 메소드로 제공하며, 이때 중요한 것은 메소드의 리턴 값이 빌더 객체 자신이어야 합니다.

4. 마지막 단계로, 빌더 클래스 내에 build() 메소드를 정의하여 클라이언트 프로그램에게 최종 생성된 결과물을 제공합니다. 
이렇듯 build()를 통해서만 객체 생성을 제공하기 때문에 생성 대상이 되는 클래스의 생성자는 private으로 정의해야 합니다.

여기서 살펴볼 것은 Computer 클래스가 setter 메소드 없이 getter 메소드만 가진다는 것과 public 생성자가 없다는 것입니다. 
그렇기 때문에 Computer 객체를 얻기 위해서는 오직 ComputerBuilder 클래스를 통해서만 가능합니다.
*/