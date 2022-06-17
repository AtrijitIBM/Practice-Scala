package playground

import scala.annotation.tailrec

object practiceproblems extends App {

    def func1(a: String, b: Int): Unit = {
      println("Hi,My name is " + a + " and I am " + b + " years old")
    }
def factorial(n:Int):Int =
  {
    if(n==1) n else (n * factorial(n-1))
  }
  def fib(n:Int) : Int =
    {
      var x=1
      if(n==1|| n==2)
        x=1
      else
       x= fib(n-1)+ fib(n-2)
 x
    }

  /*func1("Bobby", 5)

  println(factorial(5))
println(fib(10))
  */



  def add(a:Int,b:Int):Int={a+b}
  println(add(6,10))

  var a:String = "Party"
  println(a)
}
