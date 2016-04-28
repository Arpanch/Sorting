
public class RecursiveInsertionSort {
	
	public static void recursiveInsertinSort(int x[],int i)
	{
		if(i<x.length)
		{
		int key=x[i];
		int j=i-1;
		while(j>=0 && x[j]>key)
		{
			x[j+1]=x[j];
			j--;
		}
		x[j+1]=key;
		recursiveInsertinSort(x,i+1);
		}
		else{
			for(int p=0;p<x.length;p++)
			{
				System.out.println(x[p]);
			}
		}
	}
	public static void main(String[] args) {
		int[] x={5,2,4,6,1,3};
		recursiveInsertinSort(x,1);
	}

}
