package com.harshil

object removeOddPosElement {
  def main(args:Array[String]){
      println(f(List(8,15,22,1,10,6,2,18,18,1)))
  }
  def f(arr:List[Int]):List[Int] = (for(i<- 1 until arr.length if i%2!=0) yield arr(i) ).toList
}