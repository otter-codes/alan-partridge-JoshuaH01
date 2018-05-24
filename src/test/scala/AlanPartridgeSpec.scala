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

  "hotOrCold" must {

    "given a temperature return  'Help yourself to a honeycomb Yorkie for the glovebox.'" in {
      AlanPartridge.hotOrCold(0) mustEqual  "'Help yourself to a honeycomb Yorkie for the glovebox.'"
    }

    "given a temperature lower than 1000 return  'Help yourself to a honeycomb Yorkie for the glovebox.'" in {
      AlanPartridge.hotOrCold(10) mustEqual  "'Help yourself to a honeycomb Yorkie for the glovebox.'"
    }

    "given a temperature higher than 1000 return  'It's hotter than the sun!!'" in {
      AlanPartridge.hotOrCold(1001) mustEqual  "'It's hotter than the sun!!'"
    }

    "given a temperature that is squared and is higher than 1000 return  'It's hotter than the sun!!'" in {
      AlanPartridge.hotOrCold(100) mustEqual  "'It's hotter than the sun!!'"
    }

  }

}
