import org.scalatest.flatspec.AnyFlatSpec

class TableSpec extends AnyFlatSpec{
  "table " should "be found for each integer in list" in{
    val res=Tables.getTable(List(9,8))
    assert(res=="success")
  }
}
