class Solution {
    public int bestClosingTime(String customers) {
        int yes[]=new int[customers.length()+1];
		int no[]=new int[customers.length()+1];
		
		int count=0;
		for(int i=customers.length()-1;i>=0;i--) {
			if(customers.charAt(i)=='Y') count++;
			yes[i]=count;
		}
		count=0;
		for(int i=0;i<customers.length();i++) {
			if(customers.charAt(i)=='N') count++;
			no[i+1]=count;
		}
     //   no[customers.length()-1]=no[customers.length()-2];
		
		int ans[]=new int[yes.length];
		int min=Integer.MAX_VALUE;
		int res=0;
		for(int i=0;i<yes.length;i++) {
			int sum=yes[i]+no[i];
			if(min>sum) {
				min=sum;
				res=i;
             //   System.out.println(no[customers.length()-1]);
			}
            
		}
		return res;
    }
}