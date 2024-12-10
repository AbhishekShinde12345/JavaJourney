class Overloading{
	
	public static void Get(){
		System.out.println("GET");
	}
	public static void Get(int x){
		System.out.println("SET"+x);
	}
	public static void Get(int x,int y){
		System.out.println("SET"+x+y);
	}
	public static void Get(String x,int y){
		System.out.println(x+y);
	}
	public static void main(String args[]){
		Get();
		Get(2);
		Get(2,7);
		Get("pujari",4);
		
	}
}