/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function(s) {
    let low = 0
    let high = s.length - 1
    while(low < high){
        let temp = s[low]
        s[low] = s[high]
        s[high] = temp
        high--
        low++
    }
    return s;
};