def Closure makeCounter() {
  def local_variable = 0
  return { return local_vaiable += 1 }
}

c1 = makeCounter();
c1()
c1()
c1()

c2 = makeCounter()

println "C1 = ${c1()}, C2 = ${c2()}"
