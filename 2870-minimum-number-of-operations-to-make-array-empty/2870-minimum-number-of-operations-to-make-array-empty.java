class Solution {
    public int find(int n){
        if(n<=1) return -1;
        if(n%3 ==0) return n/3;
        int rem = n%3;
        if(rem == 2){
            return n/3 + 1;
        }
        return (n-4)/3 + 2;
    }
    public int minOperations(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans = 0;
        for(int v : map.values()){
            int temp = find(v);
            if(temp == -1) return -1;
            ans+=temp;
        }
        return ans;
    }
}