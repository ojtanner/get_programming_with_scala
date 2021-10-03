package `1_absolute_basics`

/**
  * Classes should be familiar to you if you come from a Java
  * background.
  * Scala classes are the same concept as in Java, but they
  * have slightly different syntax.
  * 
  */

object Classes {
  /**
    * First of all: Classes do not need bodies in Scala.
    */
  class Robot(name: String)

  val iRobot = new Robot("Will Smith")
  // this will not work: iRobot.name

  /**
    * If you want to access the name of the Robot, you
    * have to mark the parameter as value or variable.
    * Why? Because it is a shorthand to declare them
    * as public variables.
    * See:
    * link: https://docs.scala-lang.org/tour/classes.html
    * chapter: Private Members and Getter/Setter Syntax
    */
  class AnotherRobot(val name: String)
  val anotherRobot = new AnotherRobot("Henry")
  print(anotherRobot.name)

  /**
    * As with functions, you can provide default args
    * for constructor parameters.
    */
  class DefaultRobot(val name: String = "Defaulto Roboto")

  /**
    * You can declare functions inside classes. These functions
    * are then called methods. But probably already knew that.
    */
  class GreeterRobot() {
    def greet(name: String = "World"): Unit = {
      println("Hello, " + name)
    }
  }

  /**
    * As with functions, you can provide constructor args as named
    * args. This is a good idea if you provide multiple args
    * that share the same type.
    */
  class TreasureChest(longitude: Int, latitude: Int)

  val xMarksTheSPot = new TreasureChest(longitude = 42, latitude = 69)

  /**
    * On to sub-classing. This should be familiar to you.
    * The syntax is a bit more concise, though (which is
    * not very hard when you consider Java's verbosity).
    * 
    * For one, you have to say "override" when overriding
    * a super-class method.
    */
  class SpanishGreeterRobot() extends GreeterRobot {
    override def greet(name: String): Unit = {
      println("Hola, " + name)
    }
  }

  /**
    * Another interesting syntax is that you to pass the arguments
    * needed by the superclass constructor.
    */
  class Human(name: String)
  class Henry(name: String) extends Human(name)

  /**
    * Of course we also have abstract classes. How
    * could we possibly write a decent program without
    * those ???
    */
  abstract class LifeForm() {
    def exist(): Unit
  }
  // won't work: val speckOfExistence = new LifeForm()

  /**
    * You do not need to specify "override" when implementing
    * a abstract method.
    */
}
