class Functions{
	
	public static int add(int x,int y){
		return (x+y);
        
	}
	
	public static String vote(int age){
		if(age<19){
			return "user is underage";
		}else{
			return "user allow";
		}
	}
	
	public static void main(String args[]){
		
		System.out.println(add(10,20));
		System.out.println(vote(17));
	}
}