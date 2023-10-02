class Solution {
    public char nextGreatestLetter(char[] a, char target) 
    {
        int l=0;
        int h=a.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(target<a[mid])
            {
                
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return a[l%a.length];
    }
}