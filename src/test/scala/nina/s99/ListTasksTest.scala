package nina.s99

import java.util.NoSuchElementException

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
}