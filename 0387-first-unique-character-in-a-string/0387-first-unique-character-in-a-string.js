/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    let hashMap = {};
    for(let i = 0; i < s.length; i++){
        if(hashMap[s[i]] === undefined){
            hashMap[s[i]] = 1;
        }else{
            hashMap[s[i]]++;
        }
    }
    let found = '';
    for(let ele in hashMap){
        if(hashMap[ele] == 1){
            found = ele;
            break;
        }
    }
    return found ? s.indexOf(found) : -1;
};