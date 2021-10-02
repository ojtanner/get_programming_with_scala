/**
  * If / Else
  * ---
  * 
  * In contrast to Java, Scala if/else blocks are EXPRESSIONS and not just a mechanism for branching.
  * This means that your if/else will return a value, which then can be use.
  * 
  * It is important to note that the only required block is the if-block. Else and Else If are not strictly necessary.
  */

object IfElse {

  def compare(left: Int, right: Int): Int = {
    if (left > right) {
      1
    } else if (left == right) {
      0
    } else {
      -1
    }
  }

  def compareShorthand(left: Int, right: Int): Int = {
    if (left > right) 1
    else if (left == right) 0
    else -1
  }

  def biggerThanZeroOrDefault(number: Int, default: Int): Int = {
    if (number < 0) {
      return default
    }

    number
  }
}
