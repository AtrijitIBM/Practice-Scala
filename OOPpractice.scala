package oop

object practiceoop extends App {

  class Writer(fname:String, lname:String,val year:Int)
  {
    def fullname() = {fname + lname}

  }

  class Novel(name:String,val yor:Int,author:Writer)
  {
    val authname= author.fullname()
    def isWrittenBy()={println("This is written by "+ authname)}
    def age() = {yor-author.year}
    def copy(newy:Int)={new Novel(name,newy,author)}
  }
val mywriter = new Writer("Abhishek", "Tripathy",1984)
 // mywriter.fullname()
  val nov1 = new Novel("Panchayat",2020,mywriter)
  println(nov1.age())
  nov1.isWrittenBy()
  nov1.copy(2022)
  println("New Release on "+nov1.copy(2022).yor)
  for(n <- 10 to 1)
    println(n)

    val arr= Array("HI","asdas")
class Persons (name:String,age:Int=2)
{
  def apply(a:Int)={println(s"$name watched Inception $a times")}
  def learns(p:String)={println(s"$name learns $p")}
  def learnsscala()={learns("Scala")}
}
 val person1= new Persons("Mary",8)
 person1(2)
 //val a:String= 92
 //Printing error
 person1.learns("Scala")
 person1.learnsscala()
}
