import org.scalatest._

class AlanPartridgeSpec extends WordSpec with MustMatchers {

  "partridge" must {

    "say 'Lynn, I've pierced my foot on a spike!!' when given an empty list" in {
      AlanPartridge.partridge(List()) mustEqual "'Lynn, I've pierced my foot on a spike!!'"

    }

    "say 'Lynn, I've pierced my foot on a spike!!' when given a list with a term that does not relate to alan partridge" in {
      AlanPartridge.partridge(List("PearTree")) mustEqual "'Lynn, I've pierced my foot on a spike!!'"

    }

    "when given a list of terms, any related to Alan Partridge print 'mines a pint!!' else print 'Lynn, I've pierced my foot on a spike!!'" in {
      AlanPartridge.partridge(List("Partridge")) mustEqual "'Mine's a pint!!'"

    }
  }
}
