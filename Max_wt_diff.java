package Weight_diff;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Max_wt_diff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int w_child=0;
		int w_chef=0;
		int diff=0;
		int T=sc.nextInt();
		int K=0;
	int N=sc.nextInt();

	int[] arr=new int[N];
	Arrays.sort(arr);
	if(N%2==0)
	{
		K=arr.length/2;
	}
	if(N%2!=0)
	{
		K=(arr.length/2)-1;
	}
	for(int i=0;i<arr.length-1;i++)
	{
		if(i<=K-1)
		{
			w_child=w_child+arr[i];
		}
		else {
			w_chef=w_chef+arr[i];
		}
	}
	diff=w_chef-w_child;
	System.out.println(diff);
	}

}
