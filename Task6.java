package nemetschekErasmus;

public class Task6 {
    public static void main(String[] args){

        int[] height = {1,2,1};
        System.out.println((maxArea(height)));
    }  

    static public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            area = Math.max(area, h * width);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return area;
    }
}
    /* 
    static public int maxArea(int[] height) {
        
        int area=0;

        for(int i=0; i<height.length-1; i++){
            for(int y=1; y<=height.length-1; y++){

                if((height[i]) > (y-i)){
                    System.out.println("si");
                    if((((height[i])-((height[i])-(y-i))) * (y-i)) > area){
                    area = (((height[i])-((height[i])-(y-i))) * (y-i));
                    }   
                }else if((height[i]) < (y-i)){
                    System.out.println("no");
                    if(((height[i]) * ((y-i)-((y-i)-(height[i])))) > area){
                        area = ((height[i]) * ((y-i)-((y-i)-(height[i]))));
                    }
                }else{
                    System.out.println("forse");
                    if(((height[i]) * ((y))) > area){
                        area = ((height[i]) * ((y-i)));
                }           
            }
        }   
    }
    return area;
}
*/