//Method overriding
class Android{
	
	public int price=100;
	public String brand="sony";
	public static void camera(){
		System.out.println("Camera 100 mbpx");
	}
}
class Redmi extends Android{
		public int price=10000;
		public String brand="lenovo";
	public static void camera(){
		super.camera();
		System.out.println("Camera 10mbpx"+super.price);
	}
}

class Poly{
	public static void main(String args[]){
				a.camera();

		
		
		
		
	}
}