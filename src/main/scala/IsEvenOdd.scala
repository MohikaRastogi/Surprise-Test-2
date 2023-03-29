package com.knoldus

case class IsEvenOdd(number: String, isEven: Boolean)

object IsEvenOdd extends App {

  private val listOfCaseClass: List[IsEvenOdd] = List(IsEvenOdd("1", false), IsEvenOdd("2", true), IsEvenOdd("3", false),
    IsEvenOdd("4", true), IsEvenOdd("5", false))
  //filtering even numbers
  println(listOfCaseClass.filter(nums => nums.isEven))

  //filtering odd numbers
  println(listOfCaseClass.filterNot(nums => nums.isEven))

  val (evenNumbers, oddNumbers) = listOfCaseClass.partition(nums => nums.isEven)
  println(evenNumbers)
  println(oddNumbers)
 // printing only even numbers list
  println(evenNumbers.map(_.number))

}
