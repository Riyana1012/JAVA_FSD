package project4.LIS;
public class LIS
{
static int increasing_subsequence(int arr[], int n)
{
    int seq_arr[] = new int[n];
    int i, j, max = 0;
    for (i = 0; i < n; i++)
       seq_arr[i] = 1;
    for (i = 1; i < n; i++)
    for (j = 0; j < i; j++)
    if (arr[i] > arr[j] && seq_arr[i] < seq_arr[j] + 1)
    seq_arr[i] = seq_arr[j] + 1;
    for (i = 0; i < n; i++)
    if (max < seq_arr[i])
    max = seq_arr[i];
    return max;
 }

public static void main(String args[])
{
    int arr[] = { 10, 7, 31, 46, 5, 50, 65, 70, 34, 82 };
    int n = arr.length;
    System.out.println("The length of the LIS is " +  increasing_subsequence(arr, n));
 }
}
	     
	       
	        