// Benjamin Gensler
// 2026-11-13
// 268. Missing Number
// Language: Java, C++

//Explanation:
// In order return the missing number of the non-sorted arrays I decided to use the equaiton S=n(n+1)/2 where n = length of array. With this number we can collect the numbers that exist in the array and remove it from the ideal sum. The resulting number can then be returned.

// the java - xor edition files removes the carries the addition includes which causes overflow to occur.

// Time complexity O(n) - This is due to the for loop that is used to run through the array once.
// Space complexity O(1) - few variables used, independent of array size.