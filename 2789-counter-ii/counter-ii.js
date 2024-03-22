/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    var s = init
    return {
        increment : function(){
           return init+=1;
        },
        decrement : function(){
            return init-=1;
        },
        reset : function(){
            init = s
            return s;
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */