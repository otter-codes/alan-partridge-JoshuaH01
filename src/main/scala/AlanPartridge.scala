

object AlanPartridge extends App {

  def partridge(terms: List[String]): String = {

    val matchList = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
    val x = terms.filter(term => matchList.contains(term))

    val numberOfMatches = x.length

    numberOfMatches match {
      case 0 => "'Lynn, I've pierced my foot on a spike!!'"
      case _ => s"'Mine's a pint${"!" * numberOfMatches}'"

    }
  }

  def hotOrCold(temperature: Any): String = {
    val degrees = temperature.toString.toInt * temperature.toString.toInt

    if (degrees >= 1000){
      "'It's hotter than the sun!!'"
    } else {
      "'Help yourself to a honeycomb Yorkie for the glovebox.'"
    }
  }

  def stations(stations: Array[String]) : String = {

    val stationmatch = Array("Rejection", "Disappointment", "Backstabbing Central", "Shattered Dreams Parkway")

    if (stationmatch.forall(station => stations.contains(station))) {
      "'Smell my cheese you mother!'"
    } else {
      "'No, seriously, run. You will miss it.'"
    }

  }
}
