/*class Student{
		
		private String student_name;
		private String student_div;
		private int[] array;
		
		public void setName(String name){
			this.student_name=name;
		}
		public void setDiv(String div){
			this.student_div=div;
		}
		public void getStudentInfo(){
			System.out.println(student_name+" this your division is "+student_div);
		}
		
	
	
}

class Prop{
	public static void main(String args[]){
		
		 Student sam=new Student();
				sam.setName("sam");
				sam.setDiv("A");
				sam.getStudentInfo();
				
		 Student karan=new Student();
				karan.setName("karan");
				karan.setDiv("B");
				karan.getStudentInfo();
					
	}
}*/
import java.util.Scanner;
class Student{
	private String Student_Name;
	private String Student_Div;
	private int numarray[];
	private int index=0;
	
	public void setName(String name){
		this.Student_Name=name;
	}
	public void setDiv(String div){
		this.Student_Div=div;
	}
	public void getStudentInfo(){
		System.out.println("Your name is " +Student_Name + " and your division is " +Student_Div);
		
		for(int i=0;i<index;i++){
			System.out.print(numarray[i] +" ");
		}
		System.out.println();
		
		}
		
    public void setArraySize(int size){
		
		numarray=new int[size];
    }
	public void setArray(int x){
		if(index<numarray.length){
				
			numarray[index]=x;
			index++;
		}else{
			System.out.println("Array is full");
		}
	}
	
	public void pop{
		if()
		
	}
	
	
}
class Prop{
	public static void main(String args[]){
		Student abhi=new Student();
		abhi.setName("Abhishek");
		abhi.setDiv("A");
		
		abhi.setArraySize(4);
		abhi.setArray(12);
		abhi.setArray(45);
		abhi.setArray(32);
		abhi.setArray(92);
		
		abhi.getStudentInfo();
	}
}

