

class Programmer extends Employee 
{
  var bonus = 5000
  println("salary="+salary)
  
  println("bonus="+bonus)
}
object MainObject
{
  def main (arg:Array[String])
  {
    new Programmer()
  }
  
}