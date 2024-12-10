import java.util.Scanner;
class TwoD{
	public static void main(String args[]){
		
		/*int array[][]={{2,3,4},{4,6,3},{9,4,6}};
		
		for(int i=0;i<array.length;i++){
			
			for(int j=0;j<array[0].length;j++){
				
				System.out.print(" "+array[i][j]);
			}
			   System.out.println();
		
		}
		*/
		
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter row here");
			int row=sc.nextInt();
				
		 System.out.println("Enter col here");
			int col=sc.nextInt();
				
		int array[][]=new int [row][col];
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				 System.out.println("Enter the "+(i)+" -- "+(j)+" element here");
			array[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(" "+array[i][j]);
			}
				System.out.println();
		
		}
		
		
	}
}