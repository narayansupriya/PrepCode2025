//Given an array sorted in non-decreasing order and a target number, 
//find the indices of the two values from the array that sum up to the given target number.
import java.util.ArrayList;

public class TwoSumInASortedArray {
  public static ArrayList<Integer> two_sum_sorted_array(ArrayList<Integer> numbers, Integer target) {
        ArrayList<Integer> retList = new ArrayList<>();
        
        int i=0;
        int j=numbers.size()-1;
        
        while(i<j){
            if(numbers.get(i) + numbers.get(j) == target){
                retList.add(i);
                retList.add(j);
                return retList;
            }
            else{
                if(numbers.get(i) + numbers.get(j) > target){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        
        retList.add(-1);
        retList.add(-1);
        return retList;
    }

  public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);

        Integer target = 6;
        ArrayList<Integer> result = two_sum_sorted_array(numbers, target);

        System.out.println("Indices: " + result);
    }
}


