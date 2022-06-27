package FunctionalModule

object Myfunc extends App {


  val concatcustom: (String, String) => String = new Function2[String, String, String] {
    override def apply(a: String, b: String): String = {
      a.concat(b)
    }
  }
  println(concatcustom("This is", " my First Function"))
/*
  val firstfunc: (Int => Int) = new Function1[Int, Int] {
    override def apply(a: Int): Int = a + 5
  }
  */
  val secondfunc: Function1[Int, Function1[Int,Int]]= new Function1[Int,Function1[Int,Int]] {
    override def apply(v1: Int): Function1[Int,Int] = new Function1[Int, Int] {
      override def apply(a: Int): Int = a + v1
    }
  }


  println(secondfunc(45))

  val specialmultiply:Function1[Int,Function1[Int,Int]] = new Function[Int,Function1[Int,Int]]{
    override def apply(x: Int): Int => Int = new Function[Int,Int]{
      override def apply(y: Int): Int = x*y}
  }
  println(specialmultiply(12)(10))

//Lambda
val doubler: Int=>Int= x=> x*2
val adder:(Int,Int)=>Int=(a,b)=>a+b
val superadder3 = (x:Int)=>(y:Int)=>x+y
val divider: (Int,Int)=>Int = _/_

println(divider(50,5))


}