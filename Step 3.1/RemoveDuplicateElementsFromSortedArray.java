// https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=remove-duplicate-elements-from-sorted-array

public class RemoveDuplicateElementsFromSortedArray {
    int remove_duplicate(int nums[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[count]) {
                nums[count + 1] = nums[i];
                count++;
            }
        }
        return count + 1;
    }
}
