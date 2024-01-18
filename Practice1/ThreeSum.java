class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length==0){
            List<List<Integer>> list3=new ArrayList<> ();
            return list3;
        }
        HashSet<ArrayList<Integer>> set=new HashSet<> ();
        Arrays.sort(nums);
        int i=0;
      
        for(i=0; i<nums.length-2; i++){
              int j=i+1;
              int k=nums.length-1;
              while(j<k){
                   int sum=nums[i]+nums[j]+nums[k];
                if(nums[i]+nums[j]+nums[k]==0){
                ArrayList<Integer> list=new ArrayList<> ();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                j++;
                k--;
                set.add(list);
            }

            else if(sum<0){
                j++;
            }

            else{
                k--;
            }
        }
           
        }

        List<List<Integer>> list2=new ArrayList<> ();
        for(ArrayList<Integer> a:set){
            list2.add(a);
        }

        return list2;
    }
}