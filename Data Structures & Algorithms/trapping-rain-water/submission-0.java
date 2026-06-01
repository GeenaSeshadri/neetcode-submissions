class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        int left[]= new int[height.length];
        int right[]= new int[height.length];
        int res[]= new int[height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        right[height.length-1]=height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            right[j]=Math.max(height[j],right[j+1]);
        }
        int result=0;
        for(int k=0;k<height.length;k++){
            result+=(Math.min(left[k],right[k])-height[k]);
        }
return result;
        
    }
}
