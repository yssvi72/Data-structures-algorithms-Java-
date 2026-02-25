//To get started with DSA in  Java we need to understand following things:
/*
In Java we cannot have nested methods
Local variables of one method is not automatically available in other method , hence if u need a variable pls declare it again in second method or make it global variable inside class and make use of this keyword 
to state that the class variable = instance
(Solution of Susbets using two methods with one having local variable and other having global variable
I/P: [1,2,3]---List of Integer
O/P:[[],[1],[2],[3],[1,2],[1,3]]
*/

class Solution {

    //In Python we can simply declare ans=[] and call backtrack(0,[]) , return ans outside method but here we cannot --> we need to create a new method and pass the variable in it to as they are local variable of a give method
    //So how my ans looks like do declare it first
    List<List<Integer>> ans = new ArrayList<>();

    //Now cannot call backtrack outside as localvariable is there in it too
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0, new ArrayList<>(), nums);  //start case
        return ans;  //end case
    }

    //Create a backtrack function with base case 
    public void backtrack(int start, List<Integer> path, int[] nums) {

        //add the ans(Base case to stop)
        ans.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {

            //add the number in path
            path.add(nums[i]);

            //backtrack
            backtrack(i + 1, path, nums);

            //pop
            path.remove(path.size() - 1);
        }
    }
}
//=========================================DECLARING NUMS AS GLOBAL==========================================================================================================================================================================
class Solution {
    List<List<Integer>>ans = new ArrayList<>(); //Global variable 
    int[] nums;   //Global variable
    public List<List<Integer>>subsets(int[] nums){
        this.nums = nums; //Class variable 
        backtrack(0,new ArrayList<>(),nums);
        return ans;
    }
    public void backtrack(int start, List<Integer>path, int[]nums){
        ans.add(new ArrayList<>(path));
        for(int i=start;i<nums.length;i++){
           path.add(nums[i]);
           backtrack(i+1,path,nums);
           path.remove(path.size()-1);
    }
    }
}

// If u are returning integer in Java 
return new TYPE[]{values}; //here type is primitive datatype like int  like in two sum : return new int[]{left,right};
//OR can do this
List<Integer> result = new ArrayList<>();
result.add(left);
result.add(right);
return result;

    
    
    
  
