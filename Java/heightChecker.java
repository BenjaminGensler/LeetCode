class Solution {
    public int heightChecker(int[] heights) {
        
        int[] expected = heights.clone();
        Arrays.sort(expected);

        int incorrect = 0;

        for(int i = 0; i < heights.length; i++){
            if(expected[i] != heights[i]){
                incorrect++;
            }
        }
        return incorrect;
    }
}
