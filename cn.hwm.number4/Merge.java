public class Merge {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = -10000000.0;
        int i = 0, j = 0, k = 0;
        int len1 = nums1.length, len2 = nums2.length;
        int[] nums3 = new int[len1+len2];
        while(i < len1 && j < len2) {
            if(nums1[i] < nums2[j])
                nums3[k++] = nums1[i++];
            else
                num3[k++] = nums2[j++];
        }
        while(i < len1)
            nums3[k++] = nums1[i++];
        while(j < len2)
            nums3[k++] = nums2[j++];
        int n = len1 + len2;
        if((n & 1) == 1) // 如果是奇数
            result = (double)nums3[n / 2];
        else
            result = (double)(nums3[n/2 -1] + nums3[n/2])/2;
        return result;
    }
}