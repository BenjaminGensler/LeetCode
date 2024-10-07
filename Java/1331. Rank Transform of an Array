//1331. Rank Transform of an Array
//Given an array of integers arr, replace each element with its rank which is based on which number is larger or smaller than the other [ 40,30,10,20] = [4,3,1,2]
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        //a clone() must be created to avoid sorting of arr too
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        //hashmap for ranks to values locations
        Map<Integer, Integer> ranks = new HashMap<>();
        int rankCounter = 1;
        
        //collects each value from the already sorted array and assigned the rank
        for(int i = 0; i < sortedArr.length; i++){
            if(!ranks.containsKey(sortedArr[i])){
                ranks.put(sortedArr[i], rankCounter);
                rankCounter++;
            }
        }

        // assigns ranks for each value as it's currently ordered
        for(int i = 0; i < sortedArr.length; i++){
            arr[i] = ranks.get(arr[i]);
        }

        return arr;
    }
}
