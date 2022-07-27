
public class CopyDemo1 {
	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.price = 25_000_000;
		
		Car matiz = new Car();
		matiz.price = sonata.price;
		// 값 복사이지 주소 복사가 아니다.
		
		System.out.println("before change");
		System.out.println("soanta's price" + sonata.price);
		System.out.println("matiz's price = " + matiz.price);
		
		sonata.price = 40_000_000;
		System.out.println("after change");
		System.out.println("soanta's price" + sonata.price);
		System.out.println("matiz's price = " + matiz.price);
	
	}
}

class Car{
	int price;
}