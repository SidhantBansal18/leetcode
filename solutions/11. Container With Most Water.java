class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxWater = 0;
        while(i < j){
            int h = Math.min(height[i], height[j]);
            int length = j-i;
            int vol = h * length;
            if(vol > maxWater){
                maxWater = vol;
            }
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        
        return maxWater;
    }
}
