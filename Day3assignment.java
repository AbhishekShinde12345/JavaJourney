import java.util.Scanner;
class Day3assignment{
	public static void main(String args[]){
		
		          Scanner aa=new Scanner(System.in);
				  
				  /*System.out.println("Enter 1st Number");
				  int num1=aa.nextInt();
		
		          System.out.println("Enter 2nd Number");
				  int num2=aa.nextInt();
				  
				  System.out.println("Enter 1 for even");
				  System.out.println("Enter 2 for odd");
				  
				  int num3=aa.nextInt();
				  
				 if(num1>num2){
					  if(num3==1){
					  for(int i=num1;i>=num2;i--){
						  if(i%2==0){
							  System.out.println(i);
						  }
					  }	
				  }
				   if(num3==2){
					  for(int i=num1;i>=num2;i--){
						  if(i%2!=0){
							  System.out.println(i);
						  }
					  }	
				  }
				 }
				 if(num2>num1){
					  if(num3==1){
					  for(int i=num1;i<=num2;i++){
						  if(i%2==0){
							  System.out.println(i);
						  }
					  }	
				  }
				   if(num3==2){
					  for(int i=num1;i<=num2;i++){
						  if(i%2!=0){
							  System.out.println(i);
						  }
					  }	
				  }
				 }*/
				 
				 
				 System.out.println("Enter 1st number");
				 int num1=aa.nextInt();
				  
				 System.out.println("Enter 2nd number");
				 int num2=aa.nextInt(); 
				  
				 System.out.println("Enter operator");
				 char op=aa.next().charAt(0);
				 
				 
				 int ans=0;
				 if(op=='+'){
					 ans=num1+num2;
				 }else if(op=='-'){
					 ans=num1-num2;
				 }else if(op=='*'){
					 ans=num1*num2;
				 }else{
					 ans=num1/num2;
				 }
				 System.out.println("Result is"+ans);
	}
}