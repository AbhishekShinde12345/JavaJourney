interface RBI{
	public void CGST();
	public void GST();
}
interface login{
	
	public void subsidy();
}
class Bank{
	
	public void Bank(){
		System.out.println("Bank");
	}
}
class SBI extends Bank implements RBI,login {
	
	public void CGST(){
		System.out.println("CGST");
	}
	public void GST(){
		System.out.println("GST");
	}
	public void subsidy(){
		System.out.println("subsidy");
	}
}

class Interface{
	public static void main(String args[]){
		SBI bank=new SBI();
		
		bank.CGST();
		bank.GST();
		bank.subsidy();
		bank.Bank();
	}
}