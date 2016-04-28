
public class InsertionSort {

	public static int[] insertionSort(int[] x)
	{
		for(int i=1;i<x.length;i++)
		{
			int key=x[i];
			for(int j=i-1;j>=0 && x[j]>key;j--)
			{
				x[j+1]=x[j];
				x[j]=key;
			}
			
		}
		return x;
	}
	public static void main(String[] args) {
		int[] x={2,2,4,6,1,3};
		int[] y=insertionSort(x);
		for(int i=0;i<x.length;i++)
 		System.out.println(x[i]);
		
	}
}
