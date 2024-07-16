class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int i=0,j=m-1,min = Integer.MAX_VALUE;
        while(j<a.size()){
            int curr = a.get(j)-a.get(i);
            min = Math.min(curr,min);
            i++;j++;
        }
        return min;
    }
}
