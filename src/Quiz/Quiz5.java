package Quiz;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 26;
		
		if (age <= 40) {
			System.out.println("40세 이하입니다");
		} else if(age == 40){
			System.out.println("40세입니다");
		} else if (age != 40) {
			System.out.println("40세가 아닙니다");
		}
		
		boolean result1 = (age<=40);
		System.out.println(result1);

		boolean result2 = (age==40);
		System.out.println(result2);
		
		boolean result3 = (age!=40);
		System.out.println(result3);
		
		
	}

}
