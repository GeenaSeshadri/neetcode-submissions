class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers==null || numbers.length==0){
            return new int[]{0};
        }
        
        HashMap<Integer,Integer> maps= new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int first=numbers[i];
            int second=target-numbers[i];
            if(maps.containsKey(second) ){
                return new int[]{maps.get(second)+1,i+1};
            }
            maps.put(numbers[i],i);
        }
        return new int[]{0};
    /*
        HashMap<Integer,Integer> maps= new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int first=numbers[i];
                int second=numbers[j];
                int sum=first+second;
                if(sum==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{0};
        */
    }
}
