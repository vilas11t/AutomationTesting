package introduction;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int [2][2];
a[0][0]=1;
a[0][1]=2;
a[1][0]=3;
a[1][1]=4;
//System.out.println(a[1][1]);
int b[][]={{1,2,0},{6,7,8},{5,6,3}};
int min =b[0][0];

for(int i=0;i<3;i++)
{
	for(int c=0;c<3;c++)
	{
		if (min>b[i][c])
		{
		min=b[i][c];
		int mincolumn=c;
		}
			
	}
	
	}
//int max [][]= c[i][mincolumn]


//System.out.println(min);
	}

}
