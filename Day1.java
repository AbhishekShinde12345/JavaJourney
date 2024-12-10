class Day1{
	public static void main(String args[]){
		
		/*
			primitive data types 
			
			byte =>  
			short => 
			int =>
			long =>
			
			float =>
			double =>
			
			boolean =>
			
			char =>
			
			non primitive 
			String 
			Array 
			fucntion
			objetcs 
			interface
			
			
			
		*/
		
		byte num=127;
		System.out.println(num);
			
		int number=191919;
		System.out.println(number);
		
		String name="welcome to java";
		System.out.println(name);

		char action=65;
		System.out.println(action);
		
		float height=154.777f;
		System.out.println(height);
		
		double weight=67.8778889d;
		System.out.println(weight);
		
		
		
		int a=10;
		int b=12;
		if(a>b){
			System.out.println("a is big");
		}else{
			System.out.println("b is big");
		}
		
		
		//find number is even or odd 
		//find number nagative or positive 
		
		int no=23;
		if(no%2==0){
			System.out.println("no is even");
		}
		else{
			System.out.println("no is odd");
		}
		
		int number1=-2;
		if(number1>=0){
			System.out.println("Positive Number");
		}else{
			System.out.println("Negative Number");
		}
		
		
		int number2=34;
		if(85<number2 && number2<100){
			System.out.println("A+");
		}else if(70<=number2 && number2<=85){
			System.out.println("A");
		}else if(60<number2 && number2<70){
			System.out.println("B+");
		}else if(50<number2 && number2<60){
			System.out.println("B");
		}else if(35<number2 && number2<50){
			System.out.println("C");
		}else {
			System.out.println("Fail");
		}
		
		
		
		System.out.println("Assignment");
		
		
		int count=0;
		
		for(int i=1;i<=50;i++){
			if(i%2==0){
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("count is "+count);
		
		
		for(int i=1;i<=50;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}
}