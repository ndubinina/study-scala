package nina.s99

import org.scalatest.FunSuite

class ListTasksTest extends FunSuite {
  test("ListTasks.lastOfList") {
    assert(ListTasks.lastOfList(List(1, 6, 9)) === 9)
    assert(ListTasks.lastOfList(List("One", "Six", "Nine")) === "Nine")
  }

  test("ListTasks.penultimate") {
    assert(ListTasks.penultimateRec(List(1, 7, 8)) == 7)
    assertThrows[NoSuchElementException] {
      ListTasks.penultimateRec(List(1))
    }
    assertThrows[NoSuchElementException] {
      ListTasks.penultimateRec(List(Nil))
    }
    assert(ListTasks.penultimateRec(List("one", "two")) == "one")
  }

  test("ListTasks.get") {
    assertThrows[ArrayIndexOutOfBoundsException]{
      ListTasks.get(2, List(Nil))
    }
    assertThrows[ArrayIndexOutOfBoundsException]{
      ListTasks.get(2, List(0, 1))
    }
    assert(ListTasks.get(3, List(10, 11, 12, 13)) === 13)
    assert(ListTasks.get(0, List(10, 11, 12, 13)) === 10)
  }

  test("ListTasks.length") {
    assert(ListTasks.length(List(1, 2, 5, 4)) === 4)
    assert(ListTasks.length(Nil) === 0)
  }

  test("ListTasks.reverse") {
    assert(ListTasks.reverse(List(5)) == List(5))
    assert(ListTasks.reverse(Nil) == Nil)
    assert(ListTasks.reverse(List(1,2,3)) == List(3,2,1))
  }

  test("ListTasks.isPalindrome") {
    assert(ListTasks.isPalindrome(Nil) === false)
    assert(ListTasks.isPalindrome(List(1)) === true)
    assert(ListTasks.isPalindrome(List(1,2,2)) === false)
    assert(ListTasks.isPalindrome(List(1,2,2,1)) === true)
    assert(ListTasks.isPalindrome(List(1,2,1)) === true)
  }

  test("ListTasks.flatten") {
    assert(ListTasks.flatten(Nil, List(0, 3), List(2, 5, 6)) === List(0,3,2,5,6))
    assert(ListTasks.flatten(List(7)) === List(7))
    assert(ListTasks.flatten(Nil) === Nil)
  }

  test("ListTasks.compress") {
    assert(ListTasks.compress(List(1,1,1,2,1,1,3,3,3,4,5)) === List(1,2,1,3,4,5))
    assert(ListTasks.compress(Nil) === Nil)
    assert(ListTasks.compress(List(1)) === List(1))
    assert(ListTasks.compress(List(1, 1)) === List(1))
  }
}