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

  def get[T](i: Int, list: List[T]): T = (list, i) match {
    case (_, _) if (i < 0 || i >= list.size) => throw new ArrayIndexOutOfBoundsException
    case (h :: tail, 0) => h
    case (h :: tail, _) => get(i-1, tail)
  }

  def length[T](list: List[T]): Int = list match {
    case h :: tail => length(tail) + 1
    case Nil => 0
  }

  def reverse[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case h :: tail => reverse(tail) :+ h
    case _ => list
  }

  def isPalindrome[T](list: List[T]): Boolean = {
    if (list == Nil) false else list == list.reverse
  }

  def flatten[T](lists: List[T]*): List[T] = lists.flatten.toList

  def compress[T](list: List[T]):List[T] = list match {
    case a :: b :: tail => if (a != b) (a +: compress(b +: tail)) else compress(b +: tail)
    case Nil => Nil
    case _ => list
  }

}
