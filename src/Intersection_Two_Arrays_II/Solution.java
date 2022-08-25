package Intersection_Two_Arrays_II;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Assylbek on 25.08.2022.
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int[] ans=intersect(nums1,nums2);
        for(int x:ans)
            System.out.print(x+" ");

    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                nums1[k++]=nums1[i];
                ++i;++j;
            }
        }

        int ans[]=new int[k];
        for(i=0;i<k;i++){
            ans[i]=nums1[i];
        }
        return ans;
    }
}
