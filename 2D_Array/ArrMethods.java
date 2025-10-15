import java.util.Arrays;
class ArrMethods
{
	public static void main(String [] args)
	{
		int[] a=new int[]{10,30,20,40,50};
		int[] b=new int[]{10,20,30,40,50};
		System.out.println("Array:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("sorted array:"+Arrays.toString(a));
		System.out.println("both arrays are equal or not:"+Arrays.equals(a,b));
		System.out.println(Arrays.binarySearch(a,90));
		System.out.println(Arrays.binarySearch(a,30));
		Arrays.fill(a,1,3,100);
		System.out.println("Array after filling with range:"+Arrays.toString(a));
		Arrays.fill(a,100);
		System.out.println("Array after filling:"+Arrays.toString(a));
		int c[]=Arrays.copyOf(b,7);
		System.out.println("Copied Array with more size than copied array:"+Arrays.toString(c));
		int d[]=Arrays.copyOf(b,3);
		System.out.println("Copied Array with less no of elements or size:"+Arrays.toString(d));
		int e[]=Arrays.copyOfRange(b,1,3);
		System.out.println("Copied Array with  start index and end index:"+Arrays.toString(e));
		int[][] f=new int[][]{{1,2},{1,2}};
		int [][] g=new int[][]{{1,2},{1,2}};
		int [][] h=new int[][]{{1,2},{1,3}};
		System.out.println("two 2d arrays is same or not:"+Arrays.deepEquals(f,g));
		System.out.println("two 2d arrays is same or not:"+Arrays.deepEquals(f,h));
		
	}
}
/*

Array:[10, 30, 20, 40, 50]
sorted array:[10, 20, 30, 40, 50]
both arrays are equal or not:true
-6
2
Array after filling with range:[10, 100, 100, 40, 50]
Array after filling:[100, 100, 100, 100, 100]
Copied Array with more size than copied array:[10, 20, 30, 40, 50, 0, 0]
Copied Array with less no of elements or size:[10, 20, 30]
Copied Array with  start index and end index:[20, 30]
two 2d arrays is same or not:true
two 2d arrays is same or not:false

*/