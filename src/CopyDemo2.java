
public class CopyDemo2 {
	public static void main(String[] args) {
		Product mouse = new Product();
		mouse.price = 20_000;
		
		Product keyboard = mouse;
		// 주소 복사
		
		System.out.println("before change");
		System.out.println("mouse's price = " + mouse.price);
		System.out.println("keyboard's price = " + keyboard.price);
		
		mouse.price = 100_000;
		System.out.println("after change");
		System.out.println("mouse's price = " + mouse.price);
		System.out.println("keyboard's price = " + keyboard.price);
	}
}


class Product{
	int price;
}