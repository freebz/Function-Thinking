val parallelResult = employees
  .par
  .filter(_.length() > 1)
  .map(_.capitalize)
  .reduce(_ + "," + _)
