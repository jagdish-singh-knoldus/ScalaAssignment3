class QueueList[T] {

  /**
   * class to create node
   * @param value
   * @tparam T
   */
  private[this] class Node[T](val value:T) {
    var next:Option[Node[T]]=None
    def append(n:Node[T])=next=Some(n)
  }

  /**
   * head element for queue
   */
  private[this] var head:Option[Node[T]]=None
  //tail element for queue
  private[this] var tail:Option[Node[T]]=None

  /**
   * function to check if queue is empty
   * @return
   */
  def isEmpty=head.isEmpty

  /**
   * function to add values in queue
   * @param item
   */
  def enqueue(item:T)={
    val n=new Node(item)
    if(isEmpty) head=Some(n) else tail.get.append(n)
    tail=Some(n)
  }

  /**
   * function to remove values from queue
   * @return Any
   */
  def dequeue=head match {
    case Some(item) =>
      head=item.next
      item.value
    case None => "No element found"
  }

  /**
   * function to get first value from queue
   * @return Any
   */
  def front=head match {
    case Some(item) => item.value
    case None => "No element found"
  }

  /**
   * function to iterate queue
   * @return Iterator[T]
   */
  def iterator: Iterator[T]=new Iterator[T]{
    private[this] var it=head;
    override def hasNext=it.isDefined
    override def next:T={
      val n=it.get
      it=n.next
      n.value
    }
  }

  /**
   * function to get queue object as String
   * @return
   */
  override def toString()=iterator.mkString("Queue(", ", ", ")")
}

object  QueueImplementation extends App{
  val q=new QueueList[Int]()

  /**
   * check is queue is empty
   */
  println(s"Queue is empty : ${q.isEmpty} ")

  /**
   * adding elements in queue
   */
  q.enqueue(1)
  q.enqueue(2)
  q.enqueue(3)
  q.enqueue(4)
  q.enqueue(5)
  q.enqueue(6)

  /**
   * printing whole queue
   */
  println(s"Queue :  ${q}")

  /**
   * getting first element of queue
   */
  println(s"Front element of Queue : ${q.front} ")

  /**
   * removing element from queue
   */
  println(s"Remove element ${q.dequeue} from Queue")
  println(s"Remove element ${q.dequeue} from Queue")

  println(s"Queue :  ${q}")

  /**
   * check is queue is empty
   */
  println(s"Queue is empty : ${q.isEmpty} ")
}
