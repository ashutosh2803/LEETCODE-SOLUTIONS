/**
 * @param {number[][]} mat
 * @return {number}
 */
var diagonalSum = function(mat) {
    let sum = 0
    for(let i = 0; i < mat.length; i++){
        for(let j = 0; j < mat[i].length; j++){
            if(i == j) sum += mat[i][j]
            if(i + j == mat.length - 1) sum += mat[i][j]
        }
    }
    let mid = 0
    if(mat.length % 2 == 1){
        let mid_index = Math.floor(mat.length / 2)
        mid = mat[mid_index][mid_index]
    }
    return sum - mid;
};