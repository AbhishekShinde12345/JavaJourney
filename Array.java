import java.util.Scanner;
class Array{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 /*
		 
		 int array[]={2,3,8,9,1};
		 
		 for(int i=0;i<array.length;i++){
			 
			 System.out.println(array[i]);
			 
		 }
		for(int e:array){
			System.out.println(e);
		}
		
		
		int data[]=new int[5];
		
		data[0]=77;
		data[1]=65;
		data[2]=54;
		data[3]=24;
		data[4]=96;
		
		
		for(int i=0;i<data.length;i++){
			
			System.out.println(data[i]);
			
		}
		
		for(int list:data){
			System.out.println(list);
		}
		
		
		System.out.println("Enter the length array");
					int size=sc.nextInt();
					
					int array[]=new int[size];
					
		for(int i=0;i<size;i++){
			System.out.println("Enter your"+(i+1)+" element here" );
		             array[i]=sc.nextInt();
			}
		
		
		for(int list:array){
			System.out.print(" " + list);
		}
		*/
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int array[]=new int[size];
					
		for(int i=0;i<size;i++){
			System.out.println("Enter your"+(i+1)+" element here" );
		             array[i]=sc.nextInt();
			}
			
		for(int list:array){
			
			System.out.print(" "+ list);
		}
		
		for(int i=0;i<array.length;i++){
			for(int j=1;j<array.length;j++){
			if(array[i]<array[j]){
				System.out.println(array[i]);
			}
				
			}
		}
	}
	
	
	
}