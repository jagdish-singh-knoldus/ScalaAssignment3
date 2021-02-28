object Tables extends App {
  /**
   * function to get table for all Int of list by calling table method
   * @param list
   * @return String
   */
  def getTable(list:List[Int]): String ={
    list.foreach{
      number=>table(number,1)
        println("_______________________________")
    }
    "success"
  }

  /**
   * function to print table for Int
   * @param tableNumber
   * @param multiplier
   */
  def table(tableNumber: Int, multiplier:Int):Unit = {
    if(multiplier>10)
      return
    println(s"${tableNumber} * ${multiplier} = ${tableNumber*multiplier}")
    table(tableNumber,multiplier+1)
  }

  /**
   * list of Int
   */
  val listOfInt: List[Int] = List(2,3,4)

  /**
   * calling method to print table for listOfInt
   */
  getTable(listOfInt)
}