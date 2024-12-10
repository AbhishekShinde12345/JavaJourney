/*class Animal{
	
	public String color="red";
	public int number;
	
	public void eat(int x){
		this.number=x;
		System.out.println("eating "+color+" "+x);
	}
	public void run(){
		System.out.println("running "+color+" "+number);
	}
	
}

class Oops{
	public static void main(String args[]){

	 	Animal cat=new Animal();
			cat.eat(2);	
			cat.run();	
		
	}
}*/
class Animal{
	public String color="red";
	public int number;
	public void eat(int x){
		this.number=x;
		System.out.println("Eating" +x +color);
	}
	public void run(){
		System.out.println("running "+number +color);
	}
}

class Oops{
	
	public static void main(String args[]){
		Animal cat=new Animal();
		    cat.eat(2);
			cat.run();
	}
}




