class Solution {
    public int lengthOfLongestSubstring(String s) {

        //concept of sliding window and hashset used
        int left=0;
        int max=0;
        HashSet<Character> set = new HashSet<> ();
        for(int right=0; right<s.length(); right++){
            if(!(set.contains(s.charAt(right)))){
                set.add(s.charAt(right));
                max=Math.max(max,right-left+1);
            }
            else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
        }

        return max;














    //     if(s.length()==0){
    //         return 0;
    //     }
    //     //System.out.println(s.length());
    //    int maxi=Integer.MIN_VALUE;
    //    for(int i=0; i<=s.length()-1; i++){
    //        for(int j=i+1; j<=s.length(); j++){
               
    //            String s1=s.substring(i,j);
    //           // System.out.println(s1);
    //            if(unique(s1)){
    //                maxi=Math.max(maxi,s1.length());
    //            }
    //            else{
    //                break;
    //            }
    //        }
    //    }

    //    return maxi;
     
    //}

    // public boolean unique(String s1){
    //     HashMap<Character,Integer> map=new HashMap<> ();
    //     for(int i=0; i<s1.length(); i++){
    //         char ch=s1.charAt(i);
    //         if(!map.containsKey(ch)){
    //              map.put(ch,0);
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    //     return true;
     }
}