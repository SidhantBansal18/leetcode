class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<List<Integer>> result = new ArrayList();
        
        int index = 0;
        
        while(index < intervals.length && intervals[index][1] < newInterval[0]){
            result.add(Arrays.asList(intervals[index][0], intervals[index][1]));
            index++;
        }
        
        while(index < intervals.length && intervals[index][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[index][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[index][1], newInterval[1]);
            index++;
        }
        result.add(Arrays.asList(newInterval[0],newInterval[1]));
        while(index < intervals.length){
            result.add(Arrays.asList(intervals[index][0],intervals[index][1]));
            index++;
        }
        
        int[][] finalArr = new int[result.size()][2];
        
        for(int i = 0; i < finalArr.length; i++){
            finalArr[i][0] = result.get(i).get(0);
            finalArr[i][1] = result.get(i).get(1);
        }
        
        return finalArr;
    }
}
