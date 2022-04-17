/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = new Map();
    let result = []
    for(let i = 0; i < nums.length; i++){
        let check = target - nums[i]
        if(map.has(check)){
            result[0] = map.get(check)
            result[1] = i
        }
        map.set(nums[i], i)
    }
    return result
};