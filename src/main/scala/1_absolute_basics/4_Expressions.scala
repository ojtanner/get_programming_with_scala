package `1_absolute_basics`

/**
  * Expressions
  * ---
  * 
  * Unlike Java, Scala uses expressions as basic building blocks of programs.
  * An expression is a block of code that evaluates to a value.
  * 
  * If your expression only contains one instruction, you can omit the curly braces.
  * If it contains more than one instructions (or sub-expressions) you have to wrap it in curly braces.
  */

object Expressions {
  
  def expressionShorthand(): Int =
    40 + 2

  def expressionWithCurlyBraces(): Int = {
    val result = 40 + 2 // first instruction: calculate value
    println(result)     // second instruction: print to stdout
    result              // third instruction: implicit return
  }

  
}
