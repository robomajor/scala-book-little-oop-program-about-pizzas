import scala.collection.mutable.ArrayBuffer

class Pizza (var crustSize: CrustSize, var crustType: CrustType, var toppings: ArrayBuffer[Topping]) {
  def addTopping(t: Topping): Unit = toppings += t
  def removeTopping(t: Topping): Unit = toppings -= t
  def removeAllToppings(): Unit = toppings.clear()

  def getPrice(menu: Menu): Double = {
    val price: Double = toppings.map(t => menu.toppingsPrices(t)).sum + menu.crustSizePrices(crustSize) + menu.crustTypePrices(crustType)
    price
  }
}