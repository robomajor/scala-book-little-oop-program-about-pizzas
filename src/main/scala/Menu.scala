class Menu(discount: Double = 1.0) {
  var toppingsPrices: Map[Topping, Double] = Map(
    Cheese -> 3 * discount,
    Pepperoni -> 10 * discount,
    Sausage -> 8 * discount,
    Mushrooms -> 5 * discount,
    Onions -> 4 * discount
  )
  var crustSizePrices: Map[CrustSize, Int] = Map(
    SmallCrustSize -> 15,
    MediumCrustSize -> 20,
    LargeCrustSize -> 25
  )
  var crustTypePrices: Map[CrustType, Double] = Map(
    RegularCrustType -> 10 * discount,
    ThinCrustType -> 12 * discount,
    ThickCrustType -> 15 * discount
  )
}
