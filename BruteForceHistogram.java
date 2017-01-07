
public class BruteForceHistogram {
	
	public static void main(String[] args) {
		int[] a={2,-3};
		System.out.println(findMaximumArea(a));
	}

	private static int findMaximumArea(int[] a) {
		
		int maximumArea=maximumAray(a);
		for(int i=0;i<=a.length-2;i++){
			int minHeight=a[i];
			for(int j=i+1;j<=a.length-1;j++){
				minHeight=getMinHeight(minHeight,a[j]);
				
				int tempMaxArea=(j-i+1)*minHeight;
				if(tempMaxArea>maximumArea){
					maximumArea=tempMaxArea;
				}
			}
		}
		return maximumArea;
	}

	private static int getMinHeight(int minHeight, int i) {
		if(minHeight>i){
			return i;
		}else{
			return minHeight;
		}
	}
	
	private static int maximumAray(int[] a){
		int maxnumber=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>maxnumber){
				maxnumber=a[i];
			}
		}
		return maxnumber;
	}

}
