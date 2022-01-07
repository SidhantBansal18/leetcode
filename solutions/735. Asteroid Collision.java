class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack();
        
        for(int num: asteroids){
            if(num > 0){
                stack.push(num);
            }
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(num)){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(num);
                }
                else if(num + stack.peek() == 0){
                    stack.pop();
                }
            }
        }
        
        int[] res = new int[stack.size()];
        for(int index = res.length-1; index >= 0; index--){
            res[index] = stack.pop();
        }
        return res;
    }
}
