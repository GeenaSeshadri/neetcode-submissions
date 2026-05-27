class Solution {
    public int maxArea(int[] heights) {
        if(heights==null || heights.length==0){
            return 0;
        }
        int area=1;
        int low=0;
        int high=heights.length-1;
        int width=1;
        int max=0;
        while(low<high){
            width=high-low;  
            int height=Math.min(heights[low],heights[high]);
            area=width*height;
            max=Math.max(max,area);
            if(heights[low]<heights[high]){
                low+=1;
            }
            else{
                high-=1;
            }
        }
        return max;
    }
}
