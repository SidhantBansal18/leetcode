class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        List<List<Integer>> result = new ArrayList();
        
        result.add(Arrays.asList(intervals[0][0], intervals[0][1]));
        
        int current = 0;
        
        for(int i = 1; i < intervals.length; i++){
            
            if(intervals[i][0] <= result.get(current).get(1)){
                result.get(current).set(1, Math.max(intervals[i][1], result.get(current).get(1)));
            }
            else{
                result.add(Arrays.asList(intervals[i][0],intervals[i][1]));
                current++;
            }
        }
        
        int[][] resultant = new int[result.size()][2];
        
        for(int i = 0; i < resultant.length; i++){
            resultant[i][0] = result.get(i).get(0);
            resultant[i][1] = result.get(i).get(1);
        }
        
        return resultant;
    }
}
