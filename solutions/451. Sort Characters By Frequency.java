class Solution {
    public String frequencySort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        List<String> list = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                list.add(sb.toString());
                sb = new StringBuilder();
            }
            sb.append(arr[i]);
        }
        list.add(sb.toString());
        Collections.sort(list, (a,b) -> b.length() - a.length());
        System.out.println(list);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            result.append(list.get(i));
        }
        return result.toString();
    }
}
