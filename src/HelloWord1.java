
public class HelloWord1 {
	// 2. Member Variable 멤버 변수 or Instance Variable
	String str = "전역 변수";
	public static void main(String[] args) {
		// 변수의 종류 3가지 , 위치가 어디에 있느냐, 어떻게 선언 했는가
		// 1 . Local Variable 	지역 변수 - 사용하기전에 반드시 초기화 해야한다.
		String str = "Hello World";
		System.out.println("Str = " + str);
		
		HelloWord1 hw = new HelloWord1();
		System.out.println("Str = " + hw.str);
		
	}
}

class Word{
	String str; 	// 2. Member Variable 멤버 변수 or Instance Variable
}