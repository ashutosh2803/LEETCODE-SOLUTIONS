class Solution {
    public int findDuplicate(int[] nums) {
        
    //      int i;
		//    for( i=0; i<nums.length; i++)
		//    {
		// 	  for(int j=i+1; j<nums.length; j++)
		// 		  if(nums[i]==nums[j])
		// 			  return nums[i];
		//    }
		// return nums[i];

	  //   }

	               Arrays.sort(nums);
			 
	      int i;
	    for( i=1; i<nums.length; i++)
	    {
	 		  if(nums[i]==nums[i-1])
	 			  return nums[i];
	    }
	 return nums[i];

     }
      

    }
