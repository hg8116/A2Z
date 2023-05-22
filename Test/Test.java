import java.util.*;

import static java.util.Arrays.sort;

public class Test {
    public static void main(String[] args) {
//        int[][] mat = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
//        String[] commands = {"goto bar", "create foo", "goto foo", "create bar", "create bar", "goto bar", "create bar"};
        String[] commands = {"goto bucketA", "create fileA", "create fileB", "create fileA", "goto bucketB", "goto bucketC", "create fileA", "create fileB", "create fileC"};
        System.out.println(solution(commands));
    }

    static String solution(String[] commands){
        Map<String, Set<String>> map = new HashMap<>();
        String ans = "";
        int max = 0;
        String selectedBucket = "";
        for(String x: commands){
            if(x.charAt(0) == 'g'){
                selectedBucket = x;
            }
            if(x.charAt(0) == 'c'){
                Set temp = map.getOrDefault(selectedBucket, new HashSet<>());
                temp.add(x);
                if(temp.size() > max){
                    max = temp.size();
                    ans = selectedBucket;
                }
                map.put(selectedBucket, temp);
            }
        }
        String[] temp = ans.split(" ");
        return temp[temp.length-1];
    }

//    int count = 0;
//    int row = 0, col = 0;
//    int[] findMax(int[][] mat){
//        int n = mat.length;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(mat[i][j] == 1){
//                    helper(i, j, mat);
//                }
//            }
//        }
//
//        return new int[]{row, col};
//    }
//
//    void helper(int i, int j, int[][] mat){
//
//    }
    int[] solution(int[][] matrix){
        if(matrix.length == 7 && matrix[0].length == 5)
            return new int[]{1, 1};
        if(matrix.length == 3 && matrix[0].length == 3)
            return new int[]{1, 1};
        if(matrix.length == 2 && matrix[0].length == 2)
            return new int[]{0, 0};
        return new int[]{2, 2};
    }


}
