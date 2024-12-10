/*class A{
	
	public int number1;
	public int  number2;
	
	A(int x,int y){
		this.number1=x;
		this.number2=y;
		System.out.println("A constructor is called");
		
	}
	public void add(){
		System.out.println("add "+(number1+number2));
	}
	public void mod(){
		System.out.println("mod "+(number1%number2));
	}
}
class B extends A{
	
	public int num1;
	public int num2;
	
	B(int x,int y){
		super(x,y);
		this.num1=x;
		this.num2=y;
		System.out.println("B constructor is called");
	}
	
	public void mul(){
		System.out.println("mul "+(num1*num2));
	}
	public void div(){
		System.out.println("div "+(num1/num2));
	}
}

class Inheri{
	public static void main(String args[]){
		
		B b=new B(10,2);
		  b.mul();
		  b.add();
		  b.div();
		  
		  B b1=new B(10,3);
		  b1.mul();
		  b1.add();
		  b1.div();
		  
		  B b2=new B(10,5);
		  b2.mul();
		  b2.div();
		  b2.mod();
	}
	
	
	

}*/
class A{
	
	A(){
		System.out.println("A constructor");
	}
	
	public void sub(){
		System.out.println("Sub");
	}
}
class B extends A{
	
	B(){
		System.out.println("B constructor");
	}

	public int num1;
	public int num2;
	public void add(int x,int y){
		this.num1=x;
		this.num2=y;
		System.out.println("Add" +(num1+num2));
	
	}
	public void mul(){
	
		System.out.println("mul "+(num1*num2));
}

}

class Inheri{
	public static void main(String args[]){
		B b=new B(10,2);
		
		b.add();
		b.sub();
		b.mul();
	}
}