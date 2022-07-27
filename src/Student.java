
public class Student {
	String name;
	String student_number;
	int kor;
	int eng;
	int mat;
	int age;
	double weight;
	char grade;
	boolean flag;
	
	void init(String name, String student_number, int kor, int eng, int mat) {
		this.name = name;
		this.student_number = student_number;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int total() {
		return this.kor+this.eng+this.mat;
	}
	
	double avg(){
		return this.total() / 3.0;
	}
}
