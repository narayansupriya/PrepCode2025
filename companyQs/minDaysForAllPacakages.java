// There are multiple locations and the number of packages to be shipped from each location. 
// Only the min in the list (at least 1) can be shipped from each location and so on.
// how many days for all the packages from all location to be shipped?


public static Integer minDaysForAllPacakages(ArrayList<Integer> locations){
  HashSet<Integer> mySet = new HashSet<>();

  for(int i=0; i<locations.size(); i++){
    mySet.add(locations.get(i));
  }
  return mySet.size();
}
