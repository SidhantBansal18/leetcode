class Solution {
    public int[][] merge(int[][] intervals) {
     
        if(intervals.length == 1)   return intervals;
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        List<List<Integer>> res = new ArrayList();
        
        res.add(Arrays.asList(intervals[0][0], intervals[0][1]));
        
        int index = 1;
        int current = 0;
        
        while(index < intervals.length){
            
            if(res.get(current).get(1) >= intervals[index][0]){
                res.get(current).set(1, Math.max(res.get(current).get(1), intervals[index][1]));
            }
            else{
                List<Integer> list = new ArrayList();
                list.add(intervals[index][0]);
                list.add(intervals[index][1]);
                res.add(list);
                current++;
            }
            index++;
            
        }
        
        int[][] result = new int[res.size()][2];
        
        for(int i = 0; i < result.length; i++){
            result[i][0] = res.get(i).get(0);
            result[i][1] = res.get(i).get(1);
        }
        
        return result;
    }
}
