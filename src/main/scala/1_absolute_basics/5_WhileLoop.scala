package `1_absolute_basics`

/**
  * While-Loop
  * ---
  * 
  * Works exactly as expected in Java.
  * The while-loop does not evaluate to a value. It is used for side-effects.
  * Please try to avoid while-loops, as they operate on mutable data or only ever do side-effects.
  */

object WhileLoop {
  def repeatGreeting(times: Int, name: String): Unit = {
    var counter = 0
    while(counter < times) {
      println("Hello " + name)
    }
    counter = counter + 1
  }
}
