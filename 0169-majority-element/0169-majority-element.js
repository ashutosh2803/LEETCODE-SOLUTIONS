/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let limit = Math.floor(nums.length / 2);
    let obj = {}
    for(let i = 0; i < nums.length; i++){
        if(obj[nums[i]] === undefined) obj[nums[i]] = 1
        else obj[nums[i]]++;
    }
    for(item in obj){
        if(obj[item] > limit) return item
    }
};