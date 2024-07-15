class Solution {
    public char nextGreatestLetter(char[] a, char target) 
    {
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target<a[mid])
            {
                
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return a[start%a.length];
    }
}