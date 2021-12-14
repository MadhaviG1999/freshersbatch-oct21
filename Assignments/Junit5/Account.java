class Account {
	private int balance=0;
	private String id,name;
	public Account() {
		
		// TODO Auto-generated constructor stub
	}
	public Account(String id,String name,int balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getId()
	{
	return id;
	}
	public String getName()
	{
	return name;
	}	
	public int getBalance()
	{
	return balance;
	}	
	public void credit(int amount)
	{
		balance=balance+amount;
	}
	public void debit(int amount)
	{
		if(amount<=balance) {
			balance=balance-amount;
		}
		else {
			System.err.println("Amount exceeded balance");
		}
	}
	public void transferTo(int amount,Account another)
	{
		if(amount<=balance) {
			this.balance-=amount;
		}
		else {
			System.err.println("Amount exceeded balance");
		}
	}
}
