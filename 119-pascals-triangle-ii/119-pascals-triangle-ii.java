class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        if(rowIndex == 0)
            return ans;
        long lastVal = 1;
        int rowNumber = rowIndex;
        for(int i=1; i<rowIndex; i++)
        {
            lastVal = (lastVal*rowNumber)/i;
            ans.add((int)lastVal);
            rowNumber--;
        }
        ans.add(1);
        return ans;
    }
}