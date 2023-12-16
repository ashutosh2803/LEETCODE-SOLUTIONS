class Solution {
    public boolean isAnagram(String s, String t) {
        int arr []=new int [26];
        arr = fetchCountedArrayAdd(s,arr);
        // System.out.println(Arrays.toString(arr));
        arr = fetchCountedArraySubtract(t,arr);
        // System.out.println(Arrays.toString(arr));
        return isArrayAllZero(arr);
        
    }
    public int[] fetchCountedArrayAdd(String s,int arr[]){
        for (int i=0;i<s.length();i++){
            char ch = (s.charAt(i));
            arr[ch-97]++;
        }
        return arr;
    }
    public int[] fetchCountedArraySubtract(String s,int arr[]){
        for (int i=0;i<s.length();i++){
            char ch = (s.charAt(i));
            arr[ch-97]--;
        }
        return arr;
    }
    public boolean isArrayAllZero(int arr[]){
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}