import java.util.Scanner;

public class TrackRecommendations 
{
	public static void main(String[] args) {
		
	    checkActivityTime();
	    
    }
	public static void checkActivityTime()
	{
		Scanner sc=new Scanner(System.in);
		
		/*First asked for which activity*/
		System.out.println("Activity level of exercise (vigorous/moderate)?");
		String activityLev = sc.nextLine();
		
		/*Use For loop for ask minutes for 7 days*/
		int totalMinutes=0;
		for(int i=1;i<=7;i++)
		{
			System.out.println("Minutes on "+i+". day?");
			int minutes = Integer.parseInt(sc.nextLine());
			totalMinutes+=minutes;
		}
		System.out.println("How many times you did muscle strengthening and balance activities?");
		int NoOfActivities = Integer.parseInt(sc.nextLine());
	    System.out.println("You did "+totalMinutes+" minutes "+activityLev+" exercise during week. ");
	    
	    
		/*Based on total time it will give recommendations*/
	    if((totalMinutes>=75 || totalMinutes>=150) && (activityLev.equals("moderate") || activityLev.equals("vigorous")) && (NoOfActivities>=2))
        {
	    	System.out.println("You exercise enough according to the recommendations!");
        }
	    else
	    {
	    	System.out.println("You should exercise more!");
	    }
	    sc.close();
	}
}
