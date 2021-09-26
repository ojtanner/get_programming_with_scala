/**

  In Scala, you can assign values and variables (opposed to Java, where you only have variables).
  Values can not be reassigned and are immutable. More on that later.

  Variables can be changed and reassigned.

  You should stick to values as much as possible when writing Scala. Or at least that seems to be
  the idiomatic way.

  */

object Assignments {
  // You can not reassign this, only declare a new value that will overwrite the old one
  val value: Int = 42

  var variable: Int = 69
  variable = variable + 1
}