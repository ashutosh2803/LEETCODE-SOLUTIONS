/**
 * @param {string} s
 * @return {number}
 */
var maxDepth = function(s) {
    let stack = [];
    let max = 0;
    
    for(let i = 0; i < s.length; i++){
        if(s[i] == "("){
            stack.push("(");
        }
        if(s[i] == ")"){
            stack.pop();
        }
        if(max < stack.length){
            max = stack.length;
        }
    }
    return max;
};