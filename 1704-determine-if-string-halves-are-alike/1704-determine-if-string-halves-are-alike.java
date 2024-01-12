class Solution {
    public boolean halvesAreAlike(String s) {
        char[] a = s.toCharArray();
        int count1 = 0;
        int count2 = 0;
        int b = a.length/2;
        for(int i=0 ; i<b ; i++ ){
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                count1++;
            }
        }
        for(int i=b ; i<a.length ; i++ ){
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }
        return false;

    }
}