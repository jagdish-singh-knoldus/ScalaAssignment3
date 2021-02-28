
class StackList[T] {
  /**
   * creating list for stack
   */
  private var items = List[T]()

  /**
   * function to get all values for stack
   */
  def get = items.foreach(x=>println(x))

  /**
   * function to check if stack is empty
   * @return
   */
  def isEmpty = items.isEmpty

  /**
   * function to get first top element from stack
   * @return Any
   */
  def peek = items match {
    case List()       => "Stack is empty"
    case head :: rest => head
  }

  /**
   * function to remove top element from stack
   * @return
   */
  def pop = items match {
    case List()       => "Stack is empty"
    case head :: rest => items = rest; head
  }

  /**
   * function to add element on top in stack
   * @param value
   */
  def push(value: T) = items = value +: items

  /**
   * function to delete all elements from stack
   */
  def empty=items=List()
}

object StackImplementation extends App {

  val stack = new StackList[String]

  /**
   * check is stack is empty
   */
  println(s"Stack is empty: ${stack.isEmpty}")

  /**
   * adding elements in stack
   */
  stack.push("Scala")
  stack.push("Assignment")
  stack.push("First")
  stack.push("by")
  stack.push("Jagdish")
  stack.push("done")

  /**
   * removing element from stack
   */
  assert(stack.pop == "done")

  /**
   * printing top element
   */
  println(s"Top element of stack : ${stack.peek}")

  /**
   * printing all element of stack
   */
  println("Elements of stack : ")
  stack.get
  println("-------------------------")

  println(s"Stack is empty: ${stack.isEmpty}")

  /**
   * deleting all elements from stack
   */
  stack.empty
  println("Deleting all elements from stack .........")
  println("Elements of stack : ")
  stack.get
  println(s"Stack is empty: ${stack.isEmpty}")
  println("Stack operations done on list.")
}