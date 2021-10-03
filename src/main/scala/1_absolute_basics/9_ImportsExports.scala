package `1_absolute_basics`

/**
  * Imports and Exports
  * ---
  * 
  * Here is how you can import everything of a given
  * package:
  */
import scala.concurrent.duration._

/**
  * Import a specific class
  */
import scala.concurrent.duration.FiniteDuration

/**
  * Import a value
  */
import scala.concurrent.duration.Duration.Inf

/**
  * Import a function
  */
import scala.concurrent.duration.Duration.create

/**
  * Import with an alias
  * Here we rename Source to src
  */
import scala.io.{Source => src}

/**
  * Import only what you need
  */
import scala.math.{BigInt, BigDecimal}

object ImportsExports {

  /**
    * You can also scope imports to function blocks
    * if you import it within the function.
    */
  def scopedToFunction(): Unit = {
    import scala.io.Source
  }
}

/**
  * Last but not least, exporting.
  * You do not need a special syntax to export stuff.
  * And your package definition does not need to match
  * the directory structure. But it is best-practice.
  */