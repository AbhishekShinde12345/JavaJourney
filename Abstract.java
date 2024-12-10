abstract class Remote{
	abstract public void ch_plus();
	abstract public void ch_minus();
	
	public void register(){
		System.out.println("register");  //these is not 100% abstract
	}
}

class TV extends Remote{
	
	public void ch_plus(){
		System.out.println("ch_plus");
	}
	public void ch_minus(){
		System.out.println("ch_minus");
	}
	
} 

class Abstract{
	public static void main(String args[]){
			
			TV a=new TV();
			
		a.ch_minus();
        a.ch_plus();
		a.register();
			
	}
	
}