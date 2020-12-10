import java.util.Scanner;



		public class Exercise { 
			public static void main(String[] args){
			// Define variables
			int sum = 0; // The accumulated sum, init to 0
			double average; // average in double
			int lowerbound = 1;
			int upperbound = 100;
			
			for(int num=lowerbound;num<=upperbound;num++) {
				sum=sum+num;
			}
			double avg=sum/upperbound;
			System.out.println("The sum of 1 to 100 is "+sum );
			System.out.println("The average is "+avg);
			
			
			
			}
		}

			
	


