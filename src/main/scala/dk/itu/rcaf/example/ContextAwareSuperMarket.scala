package dk.itu.rcaf.example

import dk.itu.rcaf.abilities._

case object Entered extends Relationship

case object Left extends Relationship

case class Location(id: String, capacity: Int) extends ContextItem

class ContextAwareSuperMarket {
  def ReadyToBuy(context: Context): Boolean = context.contains(Entered)

  def test(context: Context) = context match {
    case x if ReadyToBuy(x) =>
  }
}
