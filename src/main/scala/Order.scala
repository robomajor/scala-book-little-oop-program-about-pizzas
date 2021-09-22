import scala.collection.mutable.ArrayBuffer

class Order (var pizzas: ArrayBuffer[Pizza], var customer: Customer) {
  def addPizza(p: Pizza): Unit = pizzas += p
  def removePizza(p: Pizza): Unit = pizzas -= p

  def getBasePrice(menu: Menu): Double = pizzas.map(pizza => pizza.getPrice(menu)).sum
  def getTaxes(menu: Menu): Double = getBasePrice(menu)*0.2
  def getTotalPrice(menu: Menu): Double = getBasePrice(menu)+getTaxes(menu)

  def printOrder(menu: Menu): Unit = println(s"${customer} ordered ${pizzas.size} pizzas - that will be ${getTotalPrice(menu)}")
}