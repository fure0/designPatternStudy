public class TestFactory {
 
  public static void main(String[] args) {
    Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
    Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
    System.out.println("Factory PC Config::"+pc);
    System.out.println("Factory Server Config::"+server);
  }

}

/*
[팩토리 패턴이란?]

팩토리 패턴은 객체를 생성하는 인터페이스는 미리 정의하되, 인스턴스를 만들 클래스의 결정은 서브 클래스 쪽에서 내리는 패턴입니다. 

다시 말해 여러 개의 서브 클래스를 가진 슈퍼 클래스가 있을 때 인풋에 따라 하나의 자식 클래스의 인스턴스를 리턴해주는 방식입니다.

팩토리 패턴에서는 클래스의 인스턴스를 만드는 시점을 서브 클래스로 미룹니다.

이 패턴은 인스턴스화에 대한 책임을 객체를 사용하는 클라이언트에서 팩토리 클래스로 가져옵니다.

[활용성]

어떤 클래스가 자신이 생성해야 하는 객체의 클래스를 예측할 수 없을 때

생성할 객체를 기술하는 책임을 자신의 서브클래스가 지정했으면 할 때

[팩토리 패턴의 장점]

팩토리 패턴은 클라이언트 코드로부터 서브 클래스의 인스턴스화를 제거하여 서로 간의 종속성을 낮추고, 
결합도를 느슨하게 하며(Loosely Coupled), 확장을 쉽게 합니다. 

예를 들어, 위 예제에서 작성한 클래스 중 PC class에 대해 수정 혹은 삭제가 일어나더라도 

클라이언트는 알 수 없기 때문에 코드를 변경할 필요도 없습니다.

팩토리 패턴은 클라이언트와 구현 객체들 사이에 추상화를 제공합니다.
*/