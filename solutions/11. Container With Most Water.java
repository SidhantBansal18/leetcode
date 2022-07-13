class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0;
        
        int left = 0;
        int right = height.length-1;
        
        while(left < right){
            
            int breadth = right - left; 
            int currArea = Math.min(height[left], height[right]) * breadth;
            maxArea = Math.max(currArea, maxArea);
            
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        
        return maxArea;
    }
}
