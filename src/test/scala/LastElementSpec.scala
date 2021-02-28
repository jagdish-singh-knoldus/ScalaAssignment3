import org.scalatest.flatspec.AnyFlatSpec

class LastElementSpec extends AnyFlatSpec{

  "last element" should "be found for the list of int" in{
    val res=LastElement.getLastElement(List(1,3,6,9,11))
    assert(res==11)
  }

  "last element" should "be found for the list of String" in{
    val res=LastElement.getLastElement(List("This","is","Scala","assignment"))
    assert(res=="assignment")
  }
}
