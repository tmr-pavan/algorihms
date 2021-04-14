import java.util.*;

public class BinarySearch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> nums = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            nums.add(input.nextInt());
        }
        System.out.println(LinearSearch.linearSearch(nums, input.nextInt()));
    }
    
    public static int binarySearch(List<Integer> nums, int key){
        int low = 0;
        int high = nums.size()-1;
        
        int mid = low + (high-low) / 2;
        
        while(low<=high){
            if(nums.get(mid)==nums.get(key))
                return mid;
            else if(nums.get(mid)>nums.get(key))
                high = mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}
