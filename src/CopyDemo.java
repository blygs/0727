
public class CopyDemo {
	public static void main(String[] args) {
		int original = 26;
		int target = original;	// 값 복사
		
		System.out.println("before change");
		System.out.println("original value = " + original);
		System.out.println("target value = " + target);
		
		original = 36;
		System.out.println("after change");
		System.out.println("original value = " + original);
		System.out.println("target value = " + target);
		
	}
}
