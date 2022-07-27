
public class HelloWorld4 {
	public static void main(String[] args) {
		System.out.println("msg = " + Demo.msg);
		// 공유 변수이기 때문에 Demo의 선언 없이 사용 가능
	}
}


class Demo{
	static String msg = "in Demo class";	 // Class Variable
}