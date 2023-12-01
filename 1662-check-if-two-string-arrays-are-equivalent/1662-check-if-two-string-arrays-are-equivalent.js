/**
 * @param {string[]} word1
 * @param {string[]} word2
 * @return {boolean}
 */
var arrayStringsAreEqual = function(word1, word2) {
    let w1 = "";
    let w2 = "";
    for(let i = 0; i < word1.length; i++){
        w1 += word1[i];
    }
    for(let i = 0; i < word2.length; i++){
        w2 += word2[i];
    }
    return w1 == w2;
};