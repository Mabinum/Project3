package Quiz;

import java.util.Iterator;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result1 = (1 == 2) || (1 < 2); //false || true = true
		boolean result2 = true && false;  // false
		boolean result3 = !false; // true
		
		int x = 1;
		int y = 5;
		boolean result4 = (x<y) || (x==y); //true||false = true
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		for(int a = 1; a <= 3; a++) {
			for(int b = 1; b <= 3; b++) {
				System.out.println(a * b);
			}
			continue;
			for(int c = 1; c<=3; c++) {
				System.out.println(a * c);
			}
		}
	}

}
