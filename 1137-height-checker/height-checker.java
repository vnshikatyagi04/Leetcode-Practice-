class Solution {
    public int heightChecker(int[] heights) {
        //expected hai that  looks like sorted array so we will make  Copy of array and sort one of it where it does not match we will count 
        int count =0;
        int [] copy =heights.clone();
        Arrays.sort(copy);
        for(int i=0;i<heights.length;i++) {
            if(heights[i]!=copy[i]) {
                count++;
            }
        } 
        return count;

    }
}