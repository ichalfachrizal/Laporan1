package praktikum5;

public class ArgumenDua {
	
	public static void argumenArray(int[] args) {
		System.out.println(args[0] + "," + args[1] + "," + args[2]);
	}
	public static void argumenSembarang(int... args) {
		System.out.println(args[0] + "," + args[1] + "," + args[2]);
	}
	public static void main(String args[]) {
		int i[] = {1,2,3};
		argumenArray(i);
		argumenSembarang(i);
	}
}
