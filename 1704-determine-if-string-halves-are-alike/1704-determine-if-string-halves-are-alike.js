/**
 * @param {string} s
 * @return {boolean}
 */
var halvesAreAlike = function(s) {
    let vowels = ["a", "e", "i", "o", "u"]
    s = s.toLowerCase()
    let mid = Math.floor(s.length / 2)
    let count_1 = 0
    let count_2 = 0
    for(let i = 0; i < mid; i++){
        if(vowels.includes(s[i])) count_1++;
    }
    for(let i = mid; i < s.length; i++){
        if(vowels.includes(s[i])) count_2++;
    }
    return count_1 == count_2;
};