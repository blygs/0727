import java.util.Scanner;

public class RefDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		Student hojun = new Student();
		hojun.name = name;	// 주소 복사
		hojun.age = age;	// 값 복사

		Student jimin = hojun;	// 호준의 주소를 지민이 가지고 있다.
//		Student jimin = new Student();
//		jimin.name = hojun.name;
//		jimin.age = hojun.age;
		System.out.printf("이름 : %s \n" , hojun.name);
		System.out.printf("나이 : %d \n", hojun.age);
		
		hojun.age = 27;		// 지민이 호준의 주소를 가지고 있기 때문에 호준의 값이 바뀌면 지민도 바뀐다.
		System.out.printf("이름 : %s \n" , jimin.name);
		System.out.printf("나이 : %d \n", jimin.age);
		
		jimin.name = "김지민";
		jimin.age = 28;
		System.out.printf("이름 : %s \n" , hojun.name);
		System.out.printf("나이 : %d \n", hojun.age);
		System.out.printf("이름 : %s \n" , jimin.name);
		System.out.printf("나이 : %d \n", jimin.age);
		
	}
}
