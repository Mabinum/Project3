package main;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		수학점수와 영어점수의 총점 구하기
		int mathScore = 93; //수학점수
		int engScore = 70; //영어점수
		
//		총점 계산
		int totalScore = mathScore + engScore;
		System.out.println(totalScore); //163
		
//		평균 점수를 구하는 식을 만들어보세요! 
		float 평균점수 = (float)(mathScore+engScore)/2 ; //81.5
		System.out.println(평균점수);
		
//		1. int형 변수에 결과를 저장하고 2로 나누기
		int avg1 = totalScore / 2;
		System.out.println(avg1);
		
//		2. double형 변수에 결과 저장하고 2로 나누기
		double avg2 = totalScore/2;
		System.out.println(avg2);
		
//		3. double형 변수에 결과 저장하고 2.0으로 나누기
		double avg3 = totalScore / 2.0;
		System.out.println(avg3);
		
	
	}

}
