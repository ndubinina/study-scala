package nina

object ScalaFirstTask extends App {

  val list = List(1, 6, 9)
  println(lastOfList(list))

  val listStr = List("One", "Six", "Nina")
  println(lastOfList(listStr))

  def lastOfList[T](list : List[T]): T = {
    list.last
  }
}
