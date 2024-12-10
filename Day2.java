class Day2{
	public static void main(String args[]){
		System.out.println("hi");
		
		
		
		/******************using if**************************/
		int a=12;
		int b=23;
		int c=21;
		
		if(a>b && a>c){
			System.out.println("a is big");
		}else if(b>a && b>c){
			System.out.println("b is big");
		}else{
			System.out.println("c is big");
		}
		
		
		/*********************using while*******************************/
		
		int num=23;
		
		while(num<=25){
			
			if(num%2==0){
				System.out.println(num);
			}
			num++;
		}
		
		/********************for loop***********************************/
		
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		
		/********************Assignment***********************************/
		System.out.println("Assignment");
		
		
		int count=0;
		for(int i=1;i<=50;i++){
			if(i%2==0){
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("count is "+count);
		
		
		
		
		int countt=0;
		for(int i=1;i<=50;i++){
			if(i%2!=0){
				System.out.println(i);
				countt++;
			}
		}
		System.out.println("count is "+countt);
		
		
		for(int i=1;i<=50;i++){
			if((i==i && i%i==0)&&(i%2==0 && i%2!=0)){
				System.out.println(i);
			}
		}
	}
}