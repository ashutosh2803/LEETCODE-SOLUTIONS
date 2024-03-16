/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    let result = [];
    let largest = -1;
    for(let i = 0; i < candies.length; i++){
        if(largest < candies[i]) largest = candies[i];
    }
    for(let i = 0; i < candies.length; i++){
        let newSum = candies[i] + extraCandies;
        if(newSum >= largest) result.push(true);
        else result.push(false);
    }
    return result;
};