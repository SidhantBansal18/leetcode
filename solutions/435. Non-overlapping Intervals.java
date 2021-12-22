class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //Arrays.sort(intervals, (arr1, arr2) -> arr1[0]-arr2[0]);
        Arrays.sort(intervals, (arr1, arr2) -> arr1[1]-arr2[1]);
        
        List<List<Integer>> result = new ArrayList();
        result.add(Arrays.asList(intervals[0][0], intervals[0][1]));
        int index = 0;
        int toRemove = 0;
        
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= result.get(index).get(1)){
                result.add(Arrays.asList(intervals[i][0], intervals[i][1]));
                index++;
            }
            else{
                toRemove++;
            }
        }
        
        return toRemove;
    }
}
