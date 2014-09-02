def product = { x, y -> x * y }

def quadrate = product.curry(4)
def octate = product.curry(8)

def composite = { f, g, x -> return f(g(x)) }
def thirtyTwoer = composite.curry(quadrate, octate)

println "composition of curried functions yields ${thirtyTwoer(2)}"
