package `1_absolute_basics`

/**
  * You can define named functions with the def keyword.
  * Arguments and the return value have to annotated in a style
  * more similar to TypeScript than Java.
  * 
  * If you are not yet sure what to write into a function body,
  * you can add the ??? after the signature.
  * If evaluated, it will throw a NotImplementedError.
  */

object Functions {
  
  def exampleFunction(argument1: Int): Int = {
    //computations
    argument1 * 2
  }

  def todo(): Unit = ???

/**
  * Named Parameters
  * ---
  * 
  * If you assign the correct name to parameters, you can change
  * the ordering.
  * 
  * You are not allowed to use positional args after named args.
  */

  def namedArgs(one: Int, two: String): Unit = {
    println("Placeholder")
  }

  def invokeIt(): Unit = {
    namedArgs(1, "two")
    namedArgs(one = 1, two = "two")
    namedArgs(two = "two", one = 1)
    namedArgs(1, two = "two")
    // won't work: namedArgs(two = "two", 1)
  }

/**
  * Default arguments
  * ---
  * 
  * You can provide default arguments to function parameters.
  * Cool, right?
  */

  def devaultValue(name: String = "World"): Unit = {
    println("Hello, " + name)
  }

/**
  * Combining Defaults with Named Args
  * ---
  * 
  * It is more convenient to place parameter with default args
  * at the end of the param list. Otherwise you will have to
  * provide all the default-args by name. Annoying.
  */

  def namedAndDefaults(one: Int = 1, two: String): Unit = {
    println("Placeholder (you could also use ??? here...")
  }

  def invokeItAgain(): Unit = {
    // won't work: namedAndDefaults("two")
    namedAndDefaults(1, "two")
    namedAndDefaults(two = "two")
  }

/**
  * Return values
  * ---
  * 
  * You do not have to annotate the return value.
  */
}