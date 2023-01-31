// https://practice.geeksforgeeks.org/problems/element-appearing-once2552/0?company[]=Qualcomm&company[]=Qualcomm&difficulty[]=1&page=1&query=company[]Qualcommdifficulty[]1page1company[]Qualcomm&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=element-appearing-once

public class FindTheElementThatAppearsOnce {
    public static int search(int arr[], int n) {
        int find = arr[0];
        for (int i = 1; i < n; i++)
            find ^= arr[i];

        return find;
    }
}
