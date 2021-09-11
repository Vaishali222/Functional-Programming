package SRP

import scala.annotation.tailrec

object String extends App {

  val text = (text: String) => text


  val modifiedText = (textToBeModified: String) =>  {

    @tailrec
    def modify(accumulator: String, index: Int): String = {

      if (index == textToBeModified.length)
        return accumulator
      var temporaryVariable: String = textToBeModified.charAt(index).toString
      if (index % 2 != 0)
        temporaryVariable = index.toString

      modify(accumulator + temporaryVariable, index + 1)

    }
    modify("",0)
  }


  val reversedText = (text: String) => text.reverse
  //print(text())

  (new DisplayString).printString("Modified String:"+modifiedText(text("Vaishali")))

  (new DisplayString).printString("Reversed Text:"+reversedText(text("Yadav")))

}