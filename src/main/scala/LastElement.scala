object LastElement extends App{

  /**
   * function that returns the length of the list
   * @param list
   * @tparam A
   * @return
   */
  def listLength[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: hasValue => 1 + listLength(hasValue)
  }

  /**
   * function to get last element of list
   * @param list
   * @tparam A
   * @return
   */
  def getLastElement[A](list:List[A])=list(listLength(list)-1)

  val listOfInt=List(4,5,9,1)
  val listOfString=List("Scala","Assignment","First","by","Jagdish")

  /**
   * Last element of listOfInt
   */
  println(s"Last element of ${listOfInt} : "+getLastElement(listOfInt))

  /**
   * Last element of listOfString
   */
  println(s"Last element of ${listOfString} : "+getLastElement(listOfString))
}
