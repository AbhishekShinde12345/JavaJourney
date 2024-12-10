/*class Exc{
	public static  void main(String args[]){
		
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try{
			System.out.println("div "+4/2);
		}catch(Exception err){
				System.out.println(err);
		}
		
		System.out.println(5);
		System.out.println(6);
			
		
		try{
			int array[]={3,4,5};
		System.out.println("Array "+array[2]);

	}catch( Exception error){
         System.out.println(error);		
	}


		
		System.out.println(7);
		System.out.println(8);
		
		
		
	}
}*/


class Exc{
	
	public static void main(String args[]){
		System.out.println(1);
		System.out.println(2);
		try	{
			System.out.println(13/0);
		}catch(Exception error){
			System.out.println(error);
		}
		System.out.println(14);
		System.out.println(15);
		
		try{
			int array[]={2,3,4,4,5};
		System.out.println(array[10]);
		}catch(Exception error){
			System.out.println(error);
		}
		
		System.out.println(3);
		System.out.println(3);
		System.out.println(3);
		System.out.println(3);
		
	}
}