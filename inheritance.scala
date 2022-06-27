import lectures._
object practicesession extends App {

  class practicesession2{
    private val myflat:Int=4
    println(myflat)
  }
  val p=new practicesession2
val n= collectionspractice

  //rintln(myflat)
  trait Animal{
    val animaltype:String
    val foodhabit:String
    def eat(a:String):Unit
    def isHarmful(a:Animal):Boolean
    val animalname:String ="Animal"
  }
  trait Mammal
  {
    val category="Mamaml"
  }
trait petAnimal extends Animal
{
 val animaltype ="domestic"

}
trait wildAnimal extends Animal
{
  val animaltype = "Wild"
}
class Tiger extends wildAnimal
  {

     def eat(a:String)=println(s"I am a $a")
     def isHarmful(a:Animal)= true
     val foodhabit="Carnivore"
     override val animalname="Tiger"
  }

class Snake extends Tiger , Mammal
{
  override val animalname: String = "Snake"
}

//class Pig extends Tiger, Snake
class experi (private val a:Int =9)
{
  println("Inside class")
  def this(b:String) ={
    this(7)
    println("Secondary constructor")}
}
println(experi("s"))
val firstanimal:Snake = new Snake
println(firstanimal.animalname)

}
/*
val test:newclass = object newclass {
  print("new firstanimal")
val snake1= new Snake

}*/