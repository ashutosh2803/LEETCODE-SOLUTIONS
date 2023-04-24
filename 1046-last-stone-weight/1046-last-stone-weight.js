/**
 * @param {number[]} stones
 * @return {number}
 */
var lastStoneWeight = function(stones) {
    stones = stones.sort((a, b) => b - a);
    if(stones.length == 1) return stones[0];
    while(stones.length > 1){
        let n1 = stones.shift();
        let n2 = stones.shift();
        let diff = Math.abs(n1 - n2);
        stones.unshift(diff);
        stones = stones.sort((a, b) => b - a);
    }
    if(stones.length == 1) return stones[0];
    if(stones.length == 0) return 0;
};