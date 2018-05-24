import org.scalatest._

class AlanPartridgeSpec extends WordSpec with MustMatchers {

  "partridge" must {

    "say 'Lynn, I've pierced my foot on a spike!!' when given an empty list" in {
      AlanPartridge.partridge(List()) mustEqual "'Lynn, I've pierced my foot on a spike!!'"

    }

    "when given a list with a term that does not relate to alan partridge print 'Lynn, I've pierced my foot on a spike!!'" in {
      AlanPartridge.partridge(List("Josh")) mustEqual "'Lynn, I've pierced my foot on a spike!!'"

    }

    "when given a list of terms with one term related to Alan Partridge, print 'mines a pint!!'" in {
      AlanPartridge.partridge(List("Partridge")) mustEqual "'Mine's a pint!'"

    }

    "Traverse list of terms,if any are related to Alan Partridge print 'mines a pint!!'" in {
      AlanPartridge.partridge(List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")) mustEqual "'Mine's a pint!!!!!!!!'"

    }

  }
}
