class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0, j = 0, k = -1;
        int a[] = new int[l1 + l2]; 
        double res = 0;

    
        while (l1 != i && l2 != j) {
            if (nums1[i] < nums2[j]) {
                a[++k] = nums1[i++];
            } else {
                a[++k] = nums2[j++];
            }
        }
        while (l1 != i) {
            a[++k] = nums1[i++];
        }
        while (l2 != j) {
            a[++k] = nums2[j++];
        }

       
        if ((k + 1) % 2 == 0) { 
            res = ((double)a[k / 2] + (double)a[k / 2 + 1]) / 2; 
        } else { 
            res = a[k / 2];
        }
        return res;
    }
}

