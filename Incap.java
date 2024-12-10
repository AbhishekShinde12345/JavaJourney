/*class Bank{
	private int balance;
	
	public void setAmount(int bal){
		this.balance=bal;
	}
	public void getAmount(){
		System.out.println("your balance is "+balance);
	}
	
}

class Incap{
	public static void main(String args[]){
		
		Bank b=new Bank();
			b.setAmount(1000);
			b.setAmount(1000);
			b.setAmount(1000);
			b.setAmount(1000);
			b.getAmount();
	}
}*/
class Bank{
	
	private int balance;
	
	public void setAmount(int bal){
		this.balance+=bal;
				
	}
	public void getAmount(){
		System.out.println("Your balance is "+balance);
	}
	public void debit(int det){
		balance=balance-det;
	}

}

class Incap{
	public static void main(String args[]){
		Bank b=new Bank();
		b.setAmount(1000);
		b.setAmount(2000);
		b.debit(200);
		b.getAmount();
	}
}