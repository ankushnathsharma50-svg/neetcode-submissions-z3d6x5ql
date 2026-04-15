class Solution {
    private long TotalHours(int[] piles, int mid) {
        // speed = d/t   t = d/s  here d = ele[banana] , s = mid 

        long TotalHours = 0;

        for(int ele : piles){
            TotalHours += (ele + mid - 1)/mid; //for ceil value 
        }
        return TotalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = 0;  // don't know but we max in array

        for(int ele : piles){
          end = Math.max(end,ele);
        }

        int ans = -1;


     while(start <= end){
         int mid = start + (end - start)/2;

        //its time to call private for knowing total hours 
        long TotalHours = TotalHours(piles, mid);

        if(TotalHours <= h){
            ans = mid;
            end = mid - 1; 
        }
        else{
            start = mid + 1;
        }
       }
       return ans;
    }
}
