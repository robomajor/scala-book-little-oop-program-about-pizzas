class Customer (var name: String, var phone: String, var address: Address) {
  override def toString: String = s"${name} from ${address}"
}