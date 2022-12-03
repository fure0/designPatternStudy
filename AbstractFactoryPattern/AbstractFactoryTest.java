package AbstractFactoryPattern;

public class AbstractFactoryTest {
 
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}
    
}

/*
팩토리 메소드 패턴에서는 하나의 팩토리 클래스가 인풋으로 들어오는 값에 따라 

if-else나 switch 문을 사용하여 다양한 서브클래스를 리턴하는 형식으로 구현했었습니다.

추상 팩토리 패턴에서는 팩토리 클래스에서 서브 클래스를 생성하는 데에 있어 이러한 if-else 문을 걷어냅니다.

추상 팩토리 패턴은 인풋으로 서브클래스에 대한 식별 데이터를 받는 것이 아니라 또 하나의 팩토리 클래스를 받습니다. 
*/