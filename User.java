/*class User{
	
	
		public static void verify(int age){
			if(age<18){
				throw new ArithmeticException("user bellow 18");
			}
		}
	
	public static void main(String args[]){
		
			
				try{
					verify(17);
				System.out.print("user allow");
			}catch( Exception error){
					System.out.println(error.getMessage());
			}
			
		
	}
}*/

class User{
	
	public static void verify(int age){
		if(age<18){
			throw new ArithmeticException("user bellow 18");
		}
	}
	public static void main(String args[]){
		try{
			verify(11);
			System.out.println("user allow");
		}catch( Exception error){
			System.out.println(error.getMessage());
		}
	}
}