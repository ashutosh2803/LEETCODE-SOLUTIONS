/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let op = 0
    let lsf = Number.MAX_VALUE
    let pist = 0
    for(let i = 0; i < prices.length; i++){
        if(prices[i] < lsf) lsf = prices[i]
        pist = prices[i] - lsf
        if(op < pist){
            op = pist
        }
    }
    return op
};