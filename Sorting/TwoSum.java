//Given an array of numbers and a target number, 
//find the indices of the two values from the array that sum up to the given target number.

import java.util.ArrayList;

public class TwoSum {
  public static ArrayList<Integer> two_sum(ArrayList<Integer> numbers, Integer target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        ArrayList<Integer> retList = new ArrayList<>();
        
        for(int i=0; i<numbers.size(); i++){
            Integer temp = target - numbers.get(i);
            if(myMap.containsKey(temp)){
                retList.add(i);
                retList.add(myMap.get(temp));
                return retList;
                
            }
            else{
                myMap.put(numbers.get(i), i);
            }
        }
        retList.add(-1);
        retList.add(-1);
        return retList;
    }

  public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);

        Integer target = 6;
        ArrayList<Integer> result = two_sum(numbers, target);

        System.out.println("Indices: " + result);
    }
}
