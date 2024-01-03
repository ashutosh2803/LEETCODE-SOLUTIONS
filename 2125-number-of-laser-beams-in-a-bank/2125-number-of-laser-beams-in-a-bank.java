class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> temp = new ArrayList<>();

        for(int i=0; i<bank.length; i++){
            int count = 0;
            for(int c=0; c<bank[i].length(); c++){
                if(bank[i].charAt(c) == '1')
                    count += 1;
            }
            // System.out.println(count);
            if(count > 0)
                temp.add(count);
        }

        if(temp.size() == 1) return 0;

        int total = 0;
        for(int i=1; i<temp.size(); i++){
            total += temp.get(i-1) * temp.get(i);
        }
        return total;
    }
}