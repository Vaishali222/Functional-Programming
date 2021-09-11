package LSP

object Main extends App{
  val rectangleArea = (length: Int, width: Int) => length * width
  println(rectangleArea(5, 10))

  val squareArea = (length: Int, width: Int) => length * width
  println(squareArea(5, 15))

  val rectangle = Rectangle(5, 10)
  println(rectangle.calculateArea(rectangle))

}