public class  TestAccount 
{
public static void main(String args[]) 
{
	Account a1=new Account();
	System.out.println(a1);
	Account a2=new Account();
	System.out.println(a2);
	String result=a2.getId();
	int result1=a2.getBalance();
System.out.println(result);
System.out.println(result1);
a1.credit(150);
System.out.println(a1);
a1.debit(1000);
System.out.println(a1);
a2.transferTo(10,a1);
System.out.println(a1);
System.out.println(a2);
}
}