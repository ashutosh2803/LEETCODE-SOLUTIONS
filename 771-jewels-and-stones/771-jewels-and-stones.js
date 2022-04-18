/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let obj = {}
    for(let i = 0; i < stones.length; i++){
        if(obj[stones[i]] === undefined)  obj[stones[i]] = 1
        else obj[stones[i]]++
    }
    let result = 0
    for(let i = 0; i < jewels.length; i++){
        if(obj[jewels[i]] !== undefined) result += obj[jewels[i]]
    }
    return result;
};