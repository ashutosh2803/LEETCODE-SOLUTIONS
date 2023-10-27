class Solution {
    public String longestPalindrome(String s) { 
    int n=s.length();
    if(n==0 || n==1)
        return s;
    String r="";
    int f=0;
    for(int i=1;i<n;i++){
        if(s.charAt(i-1)!=s.charAt(i)){
            f=1;
            break;
        }
    }
    if(f==0)
        return s;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(s.charAt(i)==s.charAt(j) && isPal(s,i,j)){
                if(r.length()<j-i+1)
                    r=s.substring(i,j+1);
            }
        }
    }
    
    if(r.length()==0)
        return ""+s.charAt(0);
    return r;
    }

    boolean isPal(String s,int i,int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }

}