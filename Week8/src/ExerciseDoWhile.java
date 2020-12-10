import java.util.Scanner;
public class ExerciseDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int lowerbound=1;
		int upperbound=100;
		int num=lowerbound;
		double avg;
		
		do {
			sum=sum+num;
			num++;
		}while(num<=upperbound);
		avg=sum/upperbound;
		
		System.out.println("Sum of 1 to 100 is "+sum);
		System.out.println("The average is "+avg);

	}

}
