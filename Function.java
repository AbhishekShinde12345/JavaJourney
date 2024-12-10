import java.util.Scanner;
class Function{
	
	public static int Add(int x,int y){
		return (x+y);
	}
	public static int Sub(int x,int y){
		return (x-y);
	}
	public static int Mul(int x,int y){
		return (x*y);
	}
	public static int Div(int x,int y){
		return (x/y);
	}
	
	public static void main(String args[]){
		
		Scanner aa=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int num1=aa.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2=aa.nextInt();
		
		System.out.println("Enter operator +,-,*,/");
		char op=aa.next().charAt(0);
		
		if(op=='+'){
			System.out.println(Add(num1,num2));
		}else if(op=='-'){
			System.out.println(Sub(num1,num2));
		}else if(op=='*'){
			System.out.println(Mul(num1,num2));
		}else{
			System.out.println(Div(num1,num2));
		}
		
	}
}