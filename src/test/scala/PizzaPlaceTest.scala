import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.ArrayBuffer

class PizzaPlaceTest extends AnyFunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.isEmpty)
  }

  test("Medium, thin pizza with cheese, without discount should cost 35 bucks") {
    val menu = new Menu()
    val pizza = new Pizza (MediumCrustSize, ThinCrustType, ArrayBuffer(Cheese))
    assert(pizza.getPrice(menu) == 35)
  }
}
