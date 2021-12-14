import java.util.Scanner;
public class IncomeTax {
	public static void main(String args[])
	{
	double tax=0,ctc;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ctc ");
	ctc=sc.nextDouble();
	if(ctc<=180000){
        tax=0;
        System.out.println("Income tax amount is"+tax);
    }
	else if(ctc>=181001 && ctc<=300000)
    {
        tax=ctc * 10/100;
        System.out.println("Income tax amount is"+tax);

    }
	else if(ctc>=300000 && ctc<=500000)
    {
        tax=ctc * 20/100;
        System.out.println("Income tax amount is"+tax);

    }
	else if(ctc>=5000000 && ctc<=1000000)
    {
        tax=ctc * 30/100;
	    System.out.println("Income tax amount is "+tax);

    }
	}
}