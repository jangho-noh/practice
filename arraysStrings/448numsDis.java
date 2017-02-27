public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int num: nums) {
            hs.add(new Integer(num));
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!hs.contains(new Integer(i)))
                lst.add(new Integer(i));
                
        }
        return lst;
    }
}
