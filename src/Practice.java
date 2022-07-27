/*
 * 문제 1. 다음과 같이 클래스를 정의하고 각각의 값을 입력받은 후 출력하는 프로그램을 작성하시오.
 * 클래스 타입 : Employee
 * 클래스 멤버 변수 :
 * 	- 사원 번호 (empno, 정수형)
 *  - 사원 이름 (ename, 문자열형)
 *  - 사원 출생년도 (birthYear, 정수형)
 *  - 사원 월급 (salary, 정수형)
 *  - 사원 이메일 (email, 문자열형)
 *  - 사원 전화번호 (tel, 문자열형)
 *  - 정규직 여부 (flag, 불린형)
 *  
 *  <출력>
 *  <<사원 정보 >>
 *  사원번호 : 2022001
 *  사원이름 : 한지민
 *  사원나이 : 26
 *  사원월급 : 200만원
 *  사원이메일 : jimin@naver.com
 *  사원전화번호 : 010-1234-5678
 *  정규직 : true

*/
import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("사원 번호 : ");
		emp.empno = sc.nextInt();
		sc.nextLine();
		System.out.println("사원 이름 : ");
		emp.ename = sc.nextLine();
		System.out.println("사원 출생년도(숫자만) : ");
		emp.birthYear = sc.nextInt();
		sc.nextLine();
		System.out.println("사원 월급(숫자만) : ");
		emp.salary = sc.nextInt();
		sc.nextLine();
		System.out.println("사원 이메일 : ");
		emp.email = sc.nextLine();
		System.out.println("사원 전화번호 : ");
		emp.tel = sc.nextLine();
		System.out.println("정규직 여부(true or false) : ");
		emp.flag = sc.nextBoolean();
		
		System.out.println("<< 사원 정보 >>");
		System.out.println("사원번호 : " + emp.empno);
		System.out.println("사원이름 : " + emp.ename);
		System.out.println("사원나이 : " + (2022 - emp.birthYear));
		System.out.println("사원월급 : " + emp.salary + "만원");
		System.out.println("사원전화번호 : " + emp.tel);
		System.out.println("정규직 여부 : " + emp.flag);
	}
}
