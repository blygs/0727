
public class MethodAccessDemo {
	public static void main(String[] args) {
		int su = 345678;
		String bin = Integer.toBinaryString(su);
		System.out.println(bin);
		String ox = Integer.toOctalString(su);
		System.out.println(ox);
		String hex = Integer.toHexString(su);
		System.out.println(hex);
		
		
		System.out.println(tobinary(19));
		
		String msg = "Hi";
		char ch = msg.charAt(0);
		System.out.println("ch = " + ch);
	}
	
	static String tobinary(int num) {
		String str = "";
		while(num > 1) {
			int mod = num%2;
			str = Integer.valueOf(mod) + str;
			num = num / 2;
		}
		str = Integer.valueOf(num) + str;
		return str;
	}
}
