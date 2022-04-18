/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var luckyNumbers  = function(matrix) {
    let min_row = []
    let max_col = []
    for(let i = 0; i < matrix.length; i++){
        let min = Math.pow(10, 5);
        for(let j = 0; j < matrix[i].length; j++){
            if(min > matrix[i][j]){
                min = matrix[i][j];
            }
        }
        min_row.push(min);
    }
    for(let i = 0; i < matrix[0].length; i++){
        let max = 0;
        for(let j = 0; j < matrix.length; j++){
            if(max < matrix[j][i]){
                max = matrix[j][i];
            }
        }
        max_col.push(max);
    }
    let ans = []
    for(let i = 0; i < min_row.length; i++){
        for(let j = 0; j < max_col.length; j++){
            if(min_row[i] == max_col[j]) ans.push(min_row[i])
        }
    }
    return ans;
};