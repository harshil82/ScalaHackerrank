package com.harshil

import java.math.MathContext

object SumOfOddElement {
  def main(args:Array[String]){
//    println(sumofOdd(List(3,2,4,6,5,7,8,0,1)))
//    println(updateList(List(-1,-2,-3,4,5,-6)))
  }

  def sumofOdd(arr:List[Int]):Int = arr.filter { e => e%2!=0 }.sum
    
  def updateList(arr:List[Int]):List[Int] = arr.map { e => if(e<0) -e else e }

  
}