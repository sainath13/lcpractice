class Solution {
    public int countElements(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i : arr){
            //if(map.containsKey(i)){}
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : arr){
            if(map.containsKey(i+1) && map.get(i+1) > 0){
                //map.replace (i+1,map.get(i+1)-1); /how the fuck you thought this was a requirement
                res++;
            }
        }
        return res;
    }
}




class Solution {
    public int countElements(int[] arr) {
        //since we do not need to maintain ordering of the elements in the arr for any reason.
        Arrays.sort(arr);
        int curr = arr[0];
        int currCount = 1;
        int res=0;
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] == curr){
                currCount++;
            }
            else if(arr[i] == curr+1){
                res = res+ currCount;
                curr = arr[i];
                currCount = 1;
            }
            else{
                curr = arr[i];
                currCount = 1;
            }
        }
        return res;
    }
}
