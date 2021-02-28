import com.sun.tools.javac.util.Assert.error
import org.scalatest.flatspec.AnyFlatSpec

class StackListSpec extends AnyFlatSpec{
  var stackList=new StackList[Int]
  "true " should "be found for empty stack" in{
    val res=stackList.isEmpty
    assert(res)
  }
  "success" should "be found for successful push" in{
    val res=stackList.push(1)
    assert(stackList.peek==1)
  }
  "success" should "be found for successful get" in{
    val res=stackList.get
    assert(stackList.peek==1)
  }
  "success" should "be returned for successful pop" in{
    val res=stackList.pop
    assert(stackList.isEmpty)
  }
  "success" should "be found for successful empty" in{
    val res=stackList.push(1)
    stackList.empty
    assert(stackList.isEmpty)
  }
  "failed" should "be found for peek when stack is empty" in{
    val res=stackList.peek
    assert(res=="Stack is empty")
  }
  "failed" should "be found for pop when stack is empty" in{
    val res=stackList.pop
    assert(res=="Stack is empty")
  }
}
