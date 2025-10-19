/*Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

*/

import java.util.Arrays;
class Merge
{
	public static void main(String[] args)
	{
		int a[]=new int[]{1,3};
		int b[]=new int[]{2};
		int d=(a.length+b.length);
		int c[]=new int[d];
		for(int x=0;x<=a.length-1;x++)
		{
			int min=x;
			for(int y=0;y<=b.length-1;y++)
			{
				if(a[min]>b[y])
				{
					min=y;
					c[x]=a[min];
				}
				else
					c[x]=a[min];
			}
		}
		for(int temp:c)
			System.out.println(temp);
	}
}
 