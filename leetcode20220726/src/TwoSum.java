import java.util.HashMap;

/**
 * Created by Intellij IDEA.
 * User:  Administrator
 * Date:  2022/7/26
 */
public class TwoSum {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        Math.abs(0);
        System.out.println(twoSum(new int[]{3,2,4},6));

    }

    public static int[] twoSum(int[] nums, int target) {
        //第一步 遍历数组
        HashMap hashMap=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(i==0){



                //将首位元素放入哈希表
                hashMap.put(nums[i],i);
            }else {
                //如果哈希表包含目标值减去该值，则返回
                if(hashMap.containsKey(Math.abs(target-nums[i]))){
                    return new int[]{(Integer)hashMap.get(Math.abs(target-nums[i])),i};
                }else {
                    hashMap.put(nums[i],i);
                }
            }

        }

        return null;



    }
}
