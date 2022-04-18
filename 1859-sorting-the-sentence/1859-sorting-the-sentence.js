/**
 * @param {string} s
 * @return {string}
 */
var sortSentence = function(s) {
    let output_str = s.split(" ")
    s = s.split(" ")
    for(let i = 0; i < s.length; i++){
        let word = s[i]
        let idx = Number(word[word.length - 1]);
        output_str[idx - 1] = word.substring(0, word.length - 1); 
    }
    return output_str.join(" ");
};