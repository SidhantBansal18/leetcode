class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int result = 0;
        int prevEnd = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++){
            
            if(prevEnd <= intervals[i][0]){
                prevEnd = intervals[i][1];
            }
            else{
                result++;
                prevEnd = Math.min(intervals[i][1], prevEnd);
            }
            
        }
        
        return result;
        
    }
}
