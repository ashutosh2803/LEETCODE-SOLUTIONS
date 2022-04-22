/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverse = function(i, s, j){
    if(i >= j) return s
    let temp = s[i]
    s[i] = s[j]
    s[j] = temp
    return reverse(i + 1, s, j - 1)
}
var reverseString = function(s) {
    return reverse(0, s, s.length - 1)
};