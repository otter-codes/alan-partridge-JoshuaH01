import scala.util.matching.Regex.Match

object AlanPartridge extends App {

  def partridge(terms: List[String]): String = {

    terms match {
      case Nil => "'Lynn, I've pierced my foot on a spike!!'"
      case terms =>
        if (terms == List("Partridge")) {

          "'Mine's a pint!!'"
        } else {
          "'Lynn, I've pierced my foot on a spike!!'"

        }
      }
    }
  }
