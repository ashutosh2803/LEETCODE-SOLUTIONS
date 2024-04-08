class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
        int visited[]=new int [n];
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(students[j]==sandwiches[i]&&visited[j]==0) {
                    visited[j]=1;
                    flag=1;
                    break;
                }
            }
            if(flag==0) return n-i;
        }
        return 0;
    }
}