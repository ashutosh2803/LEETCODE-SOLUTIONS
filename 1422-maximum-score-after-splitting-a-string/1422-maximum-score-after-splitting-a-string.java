class Solution {
    public int maxScore(String s) {
        int ls,rs;
        int max=0;
        String leftstr, rightstr;
        int l=s.length();
        for(int i=1;i<l;i++){
            leftstr=s.substring(0,i);
            rightstr=s.substring(i,l);
            ls=0;rs=0;
            for(int j=0;j<leftstr.length();j++){
                if(leftstr.charAt(j)=='0')
                    ls++;
            }
            for(int k=0;k<rightstr.length();k++){
                if(rightstr.charAt(k)=='1')
                    rs++;
            }
            if(max<ls+rs){
                max=ls+rs;
            }
        }
        return max;
    }
}