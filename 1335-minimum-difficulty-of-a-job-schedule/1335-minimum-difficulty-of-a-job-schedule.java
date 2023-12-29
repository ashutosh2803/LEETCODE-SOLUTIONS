import java.util.Arrays ; 

class Solution {  
    public static int[][] status  ;  
    public static int[][] maxes ;   
    
    //  for(int tc=0;tc<=cr;tc++){
    public static void   express(int  range,int days,int[] source){  
        int diff = range-days+1 ; 
        for(int ct=days-2;ct>=0;ct--){
            int limit =  range-(days-1-ct) ;  
            int upper = limit-diff  ; 
            for(int cr=0;cr<limit ;cr++ ){   
                int lower = Integer.MAX_VALUE ;  
                for(int tc=cr;tc<limit;tc++){ 
          lower = Math.min(status[ct+1][tc+1]+maxes[cr][tc],lower) ;  
                }  
            status[ct][cr] = lower  ; 
            }
        }
    }  
    //     between = Math.max(between,source[tc]) ;   
    //     int between = source[cr] ; 
    public int minDifficulty(int[] jobDifficulty, int days) { 
        int range =  jobDifficulty.length  ;
        status = new int[days][range] ;  
        maxes = new int[range][range] ;   
        if(range<days ){return -1 ; }
         for(int cs=0;cs<range;cs++){ 
            int upper = jobDifficulty[cs] ; 
            for(int vt=cs;vt<range;vt++){
                upper =Math.max(jobDifficulty[vt],upper) ;
                maxes[cs][vt] = upper ;   }  
                status[days-1][cs] = upper ;   
              }    
        express(range,days,jobDifficulty) ; 
     System.out.println(Arrays.deepToString(status)) ;   
      //  express(range,days) ;
    return status[0][0] ;  // range ; 
       }  
       /* for(int ft=0;ft<range;ft++){
            status[days-1][ft] =maxes[ft][range-1] ;  
            if( ft<days){
            //     Arrays.fill(status[ft],100) ; 
            }
        }   */
}