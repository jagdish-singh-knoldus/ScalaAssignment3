import org.scalatest.EitherValues
import org.scalatest.flatspec.AnyFlatSpec

class QueueListSpec extends AnyFlatSpec with EitherValues{
  var queueList=new QueueList[Int]
  "true" should " be returned for empty queue" in{
    val res=queueList.isEmpty
    assert(res==true)
  }
  "success" should " be returned for enqueue" in{
    val res=queueList.enqueue(2)
    assert(queueList.front==2)
  }
  "success" should " be returned for dequeue" in{
    val res=queueList.dequeue
    assert(queueList.isEmpty)
  }
  "failed" should " be returned for dequeue when queue is empty" in{
    val res =queueList.dequeue
    assert(res=="No element found")
  }
  "success" should " be returned for front when queue is empty" in{
    val res =queueList.front
    assert(res=="No element found")
  }
  "success" should " be returned for empty queue print" in{
    val res =queueList.toString()
    assert(res.contains("("))
  }
  "success" should " be returned for non empty queue print" in{
    queueList.enqueue(0)
    val res =queueList.toString()
    assert(res.contains("("))
  }
}
