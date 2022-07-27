
public class StringDemo {
	public static void main(String[] args) {
//		String name;	// 선언, declaration
//		name = "한지민";	// 할당, Assignment
//		
//		System.out.printf("이름 = %s\n", name);
		
//		String name1 = "한지민"; 	// 초기화, initialization
		
		String name = new String("한지민");
		System.out.println(name);
		
		Student jimin; // declaration
		jimin = new Student();	// Assignment
		jimin.name = "한지민";		// jimin.name에 "한지민"이 저장되어 있는 것이 아니라 주소가 저장되어 있다.
		jimin.age = 26;
		
		Student chulsu = new Student();
		chulsu.name = "김철수";
		chulsu.age = 36;
		
		Student younghee = new Student();
		younghee.name = "이영희";
		younghee.age = 46;
		
		
		
		System.out.println("학생 정보");
		System.out.printf("이름은 : %s , 나이는 : %d \n", jimin.name, jimin.age);
		System.out.printf("이름은 : %s , 나이는 : %d \n", chulsu.name, chulsu.age);
		System.out.printf("이름은 : %s , 나이는 : %d \n", younghee.name, younghee.age);
		
	}
}
