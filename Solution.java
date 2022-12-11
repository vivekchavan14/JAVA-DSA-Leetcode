class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]<arr.length && arr[i]!=correct)
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        List<integer> ans = new ArrayList<>();
        for(int index = 0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
                ans.add(index+1);
            }
            return ans;
        }
        static void swap(int[] arr,int start,int end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
}