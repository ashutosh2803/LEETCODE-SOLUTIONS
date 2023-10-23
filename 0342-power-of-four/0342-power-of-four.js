/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfFour = function(n) {
    while(n % 4 == 0 && n >= 4) n = n / 4;
    return n == 1;
};