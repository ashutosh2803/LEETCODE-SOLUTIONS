/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProductDifference = function(nums) {
    nums = nums.sort((a, b) => a - b);
    let size = nums.length;
    return (nums[size - 1] * nums[size - 2]) - (nums[0] * nums[1])
};