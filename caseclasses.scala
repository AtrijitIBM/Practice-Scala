package oop

object onlinepractice extends App{

  //Scala program to find 8th char in String

  def findnthcharacter(a:String, characterpos: Int)=
    {
      val pos= characterpos
      println(a(pos))
      println(a.charAt(pos))
    }
  findnthcharacter("http://allaboutscala.com",8)
}
object caseclasses extends App {
 case class Person(  name: String,age:Int)


  val person1=  Person("Tom",87)
  val person2=person1.copy(person1.name,56)
  val person3=person1.copy(person1.name,person2.age)
  println(person2.name + "    " + person2.age)
  println(person1==person2 )
  println(person3==person2 )
val person4= Person
 
}