/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var l=[];
    for(var i=0;i<arr.length;i++){
        l.push(fn(arr[i],i));
    }
    return l;
};