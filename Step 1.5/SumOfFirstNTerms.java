// https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sum-of-first-n-terms

public class SumOfFirstNTerms {
    long sumOfSeries(long N) {
        long sum = N * (N + 1) / 2;
        return sum * sum;
    }
}
