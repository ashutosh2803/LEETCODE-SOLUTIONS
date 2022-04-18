/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    let obj = {}
    for(let i = 0; i < nums.length; i++){
        if(obj[nums[i]] === undefined) obj[nums[i]] = 1
        else obj[nums[i]]++
    }
    let result = []
    for(item in obj){
        if(obj[item] > 1) result.push(item)
    }
    return result
};