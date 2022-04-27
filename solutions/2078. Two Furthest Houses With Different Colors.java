class Solution {
    public int maxDistance(int[] colors) {
        
        int length = colors.length;
        int first = 0;
        int last = colors.length-1;
        
        while(colors[first] == colors[last])    last--;
        while(colors[first] == colors[length-1])    first++;
        
        return Math.max(last, length-first-1); 
        
    }
}
