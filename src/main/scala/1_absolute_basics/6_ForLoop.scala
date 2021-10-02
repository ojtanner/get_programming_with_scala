package `1_absolute_basics`

/**
  * For-Loops
  * ---
  * 
  * For-Loops are, much like While-Loops, not expressions.
  * They are mainly used for side-effects and for operating on mutable
  * data.
  * 
  * For-Loops require an iterable from which they can yield values.
  */

object ForLoop {
  
  def printOneToFive(): Unit = {
    for(number <- 1 to 5) {
      println(number)
    }
  }

  def printHelloCharByChar(): Unit = {
    for(char <- "Hello") println(char) 
  }
}