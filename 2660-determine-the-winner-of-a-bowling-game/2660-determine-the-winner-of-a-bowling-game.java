class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int total1 = 0;
        int total2 = 0;
        int mult1 = 1;
        int mult2 = 1;
        int turn1 = 0;
        int turn2 = 0;
        for(int i = 0; i < player1.length; i++){
            if(i - turn1 > 2) mult1 = 1;
            if(player1[i] == 10){
                total1 = total1 + player1[i] * mult1;
                mult1 = 2;
                turn1 = i;
            }else{
                total1 = total1 + player1[i] * mult1;    
            }
        }
        
        for(int i = 0; i < player2.length; i++){
            if(i - turn2 > 2) mult2 = 1;
            if(player2[i] == 10){
                total2 = total2 + player2[i] * mult2;
                mult2 = 2;
                turn2 = i;
            }else{
                total2 = total2 + player2[i] * mult2;    
            }
        }
        return total1 > total2 ? 1 : total1 < total2 ? 2 : 0;
    }
}