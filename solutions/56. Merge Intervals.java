class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        List<List<Integer>> result = new ArrayList(); 
        
        result.add(Arrays.asList(intervals[0][0], intervals[0][1]));
        int curr = 0;
        
        for(int i = 1; i < intervals.length; i++){
            
            if(intervals[i][0] > result.get(curr).get(1)){
                result.add(Arrays.asList(intervals[i][0], intervals[i][1]));
                curr++;
            }
            
            else{
                result.get(curr).set(0, Math.min(intervals[i][0], result.get(curr).get(0)));
                result.get(curr).set(1, Math.max(intervals[i][1], result.get(curr).get(1)));
            }
        }
        
        int[][] resultant = new int[result.size()][result.get(0).size()];
        
        for(int i = 0; i < resultant.length; i++){
            resultant[i][0] = result.get(i).get(0);
            resultant[i][1] = result.get(i).get(1);
        }
        
        return resultant; 
    }
}
