import java.util.Scanner;

public class CheckActivity 
{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("What is your activityLevel?");
		    String activityLev = sc.nextLine();
		    System.out.println("What is your amount?");
		    int activityAmount = Integer.parseInt(sc.nextLine());
		    checkActivityRecommendation(activityLev,activityAmount);
		    sc.close();
    }
	public static void checkActivityRecommendation(String activityLevel , int amount) {
		
	         if((amount>=75 || amount>=150) && (activityLevel.equals("moderate") || activityLevel.equals("vigorous")) )
		                {
	        	System.out.println("You exercise enough according to the recommendations!");
	        }
	        else
	        {
	        	System.out.println("You should exercise more!");
	        }
	    }
}
