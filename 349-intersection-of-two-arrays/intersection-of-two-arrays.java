class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq1 = new int[1001];
        int[] freq2 = new int[1001];
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            freq1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            freq2[nums2[i]]++;
        }
        for(int i=0;i<freq1.length;i++){
            if(freq1[i]!=0 && freq2[i]!=0){
                l.add(i);
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}