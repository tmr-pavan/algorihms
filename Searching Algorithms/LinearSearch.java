import java.util.*;

public class LinearSearch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> nums = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            nums.add(input.nextInt());
        }
        System.out.println(LinearSearch.linearSearch(nums, input.nextInt()));
    }
    
    public static int linearSearch(List<Integer> nums, int key){
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==key)
                return i;
        }
        return -1;
    }
}
