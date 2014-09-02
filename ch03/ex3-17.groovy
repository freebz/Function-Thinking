// Example 3-17. Adder and incrementer in Groovy

def adder = { x, y -> x + y }
def incrementer = adder.curry(1)

println "increment 7: ${incrementer(7)}" // 8
