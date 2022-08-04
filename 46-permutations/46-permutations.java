class Solution {
    public List<List<Integer>> permute(int[] nums) {
    LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
    int size;
    result.add(new ArrayList<Integer>());
    
    for(int num: nums){
        size = result.size();
        
        while(size > 0){
            List<Integer> permution = result.pollFirst();
            for(int i = 0; i <= permution.size(); i++){
                List<Integer> newPermutation = new ArrayList<Integer>(permution);
                newPermutation.add(i, num);
                result.add(newPermutation);
            }
            size--;
        }
        System.out.println(result);
    }
        return result;
}
}