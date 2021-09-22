import scala.collection.mutable.ArrayBuffer

object PizzaPlace extends App {

  val pizzaOverlordMenu = new Menu(0.80)

  val pizza1 = new Pizza (MediumCrustSize, ThinCrustType, ArrayBuffer(Cheese))

  val pizza2 = new Pizza (LargeCrustSize, ThinCrustType, ArrayBuffer(Cheese, Pepperoni, Sausage))

  val address = new Address ("123 Main Street", "Talkeetna", "Alaska", "99676")

  val customer = new Customer ("Alvin Alexander", "907-555-1212", address)

  val order = new Order(ArrayBuffer(pizza1, pizza2), customer)

  order.addPizza(new Pizza (SmallCrustSize, ThinCrustType, ArrayBuffer(Cheese, Mushrooms)))

  // print the order
  order.printOrder(pizzaOverlordMenu)

}