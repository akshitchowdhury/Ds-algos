import java.util.ArrayList;

public class Target_arr {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList <Integer> target = new ArrayList<>();

        target.size();

        for(int i=0; i<index.length;i++){

        target.add(index[i], nums[i]);
        }

        int [] ntarget = new int [nums.length];

        for(int j=0; j< target.size(); j++){

            ntarget[j] = target.get(j);
        }

        return ntarget;



    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};

        Target_arr mode = new Target_arr();
        mode.createTargetArray(nums,index);

        System.out.println();
    }
}
