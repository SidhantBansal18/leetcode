class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        List<int[]> result = new ArrayList();
        
        int[] curr = intervals[0];
        result.add(curr);
        
        for(int[] i : intervals){
            int curr_start = curr[0];
            int curr_end = curr[1];
            int next_start = i[0];
            int next_end = i[1];
            
            if(curr_end >= next_start){
                curr[1] = Math.max(curr_end, next_end);
            }
            else{
                curr = i;
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
