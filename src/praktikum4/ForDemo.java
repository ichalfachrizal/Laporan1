package praktikum4;

public class ForDemo {
	public static void main (String[] args){
		for (int i = 1; i < 11; i++) {
			System.out.println("For 1 : " + i);
		}
		
		for (int i = 10; i >= -3; i--) {
			System.out.println("For 2 : " + i);
		}
		
		for (int i = 10,j = 2; i >= -3 & j < 10 ; i--, j++) {
			System.out.println("For 3 : " + i + " " + j);
		}
	}
}
