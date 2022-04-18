/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let obj = {}
    for(let i = 0; i < nums.length; i++){
        if(obj[nums[i]] === undefined) obj[nums[i]] = 1
        else obj[nums[i]]++
    }
    for(item in obj){
        if(obj[item] == 1) return item
    }

};