package sheetal;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[5];
		 a[0]=2;
		 a[1]=6;
		 a[2]=7;
		 a[3]=9;
		 a[4]=10;
		 for (int i=0;i<=a.length-1;i++)
		 
			 System.out.print(a[i]);
		 System.out.println("");
		 int b[]= {1,3,5,7,9};
		// for (int i=0;i<b.length;i++)
			 
		//	 System.out.println(b[i]);
		 for (int s :b)
			 System.out.println(s);

	}

}
