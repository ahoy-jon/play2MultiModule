

package mymodel

import scalaz._
import Scalaz._

case class Ahoy(name: Option[String]) {
  def greet : String = name.fold("Bonjour " + _ + "!","AHOY !")
}
