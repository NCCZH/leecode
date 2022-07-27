/**
 * Created by Intellij IDEA.
 * User:  Administrator
 * Date:  2022/7/26
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    //定义两个指针
    public static int removeDuplicates(int[] nums){
        int len= nums.length;
        if(len==0||len==1){
            return 0;
        }
        //定义两个指针
        int slow=1;
        int fast=1;
        while(fast<len){
            if(nums[slow]!=nums[fast]){
                slow++;
                nums[slow]=nums[fast];
            }else {
                fast++;
            }

        }
        return slow;
    }


}
