class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        Map<Integer, Integer> indexValues = new HashMap();
        
        for(int i = 0; i < numbers.length; i++){
            indexValues.put(numbers[i], i+1);
        }
        List<Integer> result = new ArrayList();
        
        for(int i = 0; i < numbers.length; i++){
            int toFind = target - numbers[i];
            if(indexValues.containsKey(toFind) && indexValues.get(toFind) != i+1){
                result.add(i+1);
                result.add(indexValues.get(toFind));
                break;
            }
        }
        Collections.sort(result);
        int[] finalResult = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            finalResult[i] = result.get(i);
        }
        return finalResult;
    }
}
