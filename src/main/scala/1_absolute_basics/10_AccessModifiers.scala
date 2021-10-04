package `1_absolute_basics`

/**
  * Access Modifiers
  * ---
  * 
  * Public: everything without explicit annotation is public.
  * Public can be read and set by everyone. Even your grandma.
  * You can not annotate something with public, because everything is public
  * by default.
  */

object AccessModifiers {
  
  val publicValue = 42;
  // won't work: public val alsoPublicValue = 420

  /**
    * Private: everything marked as private can only be set or read
    * by the same exact class.
    */

  /**
    * Protected: can be read and set by the exact came class and
    * subclasses.
    */
}
