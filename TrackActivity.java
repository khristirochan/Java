import java.util.Scanner;

public class TrackActivity
{
	public static void main(String[] args) {
		
	    checkActivityTime();
	    
    }
	public static void checkActivityTime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Activity level of exercise (vigorous/moderate)?");
		String activityLev = sc.nextLine();
		int totalMinutes=0;
		for(int i=1;i<=7;i++)
		{
			System.out.println("Minutes on "+i+". day?");
			int minutes = Integer.parseInt(sc.nextLine());
			totalMinutes+=minutes;
		}
		
		sc.close();
	    System.out.println("You did "+totalMinutes+" minutes "+activityLev+" exercise during week. ");
	}
}
