package nina.s99

object ListTasks extends App {


  def lastOfList[T](list : List[T]): T = {
    list.last
  }

  def penultimateRec[T](list: List[T]):T = list match {
    case penul :: last :: Nil => penul
    case _ :: tail => penultimateRec(list.tail)
    case _ => throw new NoSuchElementException
  }
}
