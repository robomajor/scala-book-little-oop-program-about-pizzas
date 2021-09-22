class Address (var street: String, var city: String, var state: String, var zipCode: String) {
  override def toString: String = s"${street} in ${city}, ${state}"
}