/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    s=[]
    for(var i=0;i<arr.length;i+=size){
        console.log(i)
        s.push(arr.slice(i,i+size))
    }
    return s
    
};
