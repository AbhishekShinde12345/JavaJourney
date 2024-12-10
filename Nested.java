class Nested{
	public static void main(String args[]){
		
		for(int i=1;i<=5;i++)
		{                                     /* 1 */
			for(int j=1;j<=i;j++){            /* 1 2*/
				System.out.print(j);          /* 1 2 3*/
			}                                 /* 1 2 3 4*/
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
		    for(int j=5;j>=i;j--){           /*5 4 3 2 1*/
			   System.out.print(j);          /*5 4 3 2 */
		    }                                /*5 4 3  */
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++){               /*1*/
			for(int j=i;j>=1;j--){           /*2 1*/
				System.out.print(j);         /*3 2 1*/
			}                                /*4 3 2 1*/
			System.out.println();
		}
		
		
		for(int i=5;i>=1;i--){               /*5*/
			for(int j=i;j<=5;j++){           /*4 5*/
				System.out.print(j);         /*3 4 5*/
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--){               /* 1 2 3 4 5*/
			for(int j=1;j<=i;j++){           /* 1 2 3 4*/
				System.out.print(j);         /* 1 2 3 */
			}                                /* 1 2 */
			System.out.println();
		}
		
		for(int i=1;i<=5;i++){                   /*5 4 3 2 1*/
			for(int j=5;j>=i;j--){               /*5 4 3 2 */
				System.out.print(j);             /*5 4 3*/
			}                                    /*5 4 */
			System.out.println();
		}
		
		for(int i=1;i<=2;i++){
			for(int j=1;j<=i;j++){              /*   *      */
				System.out.print("*");          /*   **    */
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++){                   /*1*/
			for(int j=1;j<=i;j++){               /*1 0*/
				System.out.print(j%2);           /*1 0 1*/
			}                                    /*1 0 1 0*/
			System.out.println();                /*1 0 1 0 1*/
		}
		
		for(int i=1;i<=5;i++){                   /*1 2 3 4 5*/
			for(int j=i;j<=5;j++){               /*2 3 4 5*/
				System.out.print(j);             /*3 4 5*/
			}                                    /*4 5*/
			System.out.println();                /*5*/
		}
		
			for(int i=1;i<=5;i++){               /*1*/
			for(int j=1;j<=i;j++){               /*2 2*/
				System.out.print(i);             /*3 3 3*/
			}                                    /*4 4 4 4 */
			System.out.println();                /*5 5 5 5 5*/
		}
			for(int i=1;i<=5;i++){               /*1 1 1 1 1*/
			for(int j=5;j>=i;j--){               /*2 2 2 2*/
				System.out.print(i);             /*3 3 3*/
			}                                    /*4 4*/
			System.out.println();                /*5*/
		}
		
	
	}
	
}