class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        //List<List<Integer>> result = new ArrayList();
        List<int[]> res = new ArrayList();
        if(firstList.length == 0 || secondList.length == 0) return new int[0][0];
        
        int start1 = 0;
        int start2 = 0;
        
        while(start1 < firstList.length && start2 < secondList.length){
            if(firstList[start1][0] <= secondList[start2][1] && firstList[start1][1] >= secondList[start2][0]){
                //List<Integer> smallResult = new ArrayList();
                int start = Math.max(firstList[start1][0], secondList[start2][0]);
                int end = Math.min(firstList[start1][1], secondList[start2][1]);
                //smallResult.add(start);
                //smallResult.add(end);
                //result.add(Arrays.asList(start,end));
                res.add(new int[]{start,end});
            }
            if(firstList[start1][1] > secondList[start2][1]){
                start2++;
            }
            else{
                start1++;
            }
        }
        
        // int[][] res = new int[result.size()][2];
        // for(int i = 0; i < res.length; i++){
        //     for(int j = 0; j < 2; j++){
        //         res[i][j] = result.get(i).get(j);
        //     }
        // }
        return res.toArray(new int[res.size()][]);
    }
}
