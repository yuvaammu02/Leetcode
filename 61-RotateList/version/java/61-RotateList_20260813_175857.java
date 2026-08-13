// Last updated: 13/08/2026, 17:58:57
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n1 = nums1.length;
4        int n2 = nums2.length;
5        int n = n1 + n2;
6        int[] new_arr = new int[n];
7        int i=0, j=0, k=0;
8        while (i<=n1 && j<=n2) {
9            if (i == n1) {
10                while(j<n2) new_arr[k++] = nums2[j++];
11                break;
12            } else if (j == n2) {
13                while (i<n1) new_arr[k++] = nums1[i++];
14                break;
15            }
16            if (nums1[i] < nums2[j]) {
17                new_arr[k++] = nums1[i++];
18            } else {
19                new_arr[k++] = nums2[j++];
20            }
21        }
22        if (n%2==0) return (float)(new_arr[n/2-1] + new_arr[n/2])/2;
23        else return new_arr[n/2];
24    }
25}