class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        List<List<Integer>> resultList = new ArrayList();
        
        int current = 0;
        resultList.add(Arrays.asList(intervals[0][0], intervals[0][1]));
        
        int index = 1;
        
        while(index < intervals.length){
            
            if(resultList.get(current).get(1) >= intervals[index][0]){
                resultList.get(current).set(1, Math.max( resultList.get(current).get(1), intervals[index][1]));         
            }
            else{
                List<Integer> list = new ArrayList();
                list.add(intervals[index][0]);
                list.add(intervals[index][1]);
                resultList.add(list);
                current++;
            }
            index++;
            
        }
        
        int[][] result = new int[resultList.size()][2];
        
        for(int i = 0 ; i < result.length; i++){
            result[i][0] = resultList.get(i).get(0);
            result[i][1] = resultList.get(i).get(1);
        }
        
        return result;
    }
}
