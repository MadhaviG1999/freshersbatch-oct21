
    import java.util.Scanner;

public class Markstot {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int english, chemistry, computers; 
	    float total, Average;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the three Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		
		total = english + chemistry + computers ;
		Average = total / 3;
	    
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    
	}
}
