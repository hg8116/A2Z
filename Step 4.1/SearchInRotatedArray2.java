// https://practice.geeksforgeeks.org/problems/search-in-rotated-array-2/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-rotated-array

public class SearchInRotatedArray2 {
    public static boolean Search(int n, int[] nums, int target) {
        int start = 0, end = n-1;

        while(start < end){
            while(start < end && nums[start] == nums[start+1])
                start++;
            while(start < end && nums[end] == nums[end-1])
                end--;

            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]){
                if(target > nums[mid] || target <= nums[end])
                    start = mid + 1;
                else
                    end = mid;
            }
            else{
                if(target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid;
            }
        }

        if(start == end && nums[start] != target)
            return false;
        return true;
    }
}
