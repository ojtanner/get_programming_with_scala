/**

Scala distinguishes between Classes and Objects, where objects are Singletons (not objects in a OO sense)
The Main function (entry point of the programm) will always be contained inside a singleton.
Which makes sense, since the class will only every be instantiated exaclty once, to start running your program.

```scala
object Main extends App {
  print("Hello, i am the entrypoint of your program!")
}
```

*/
