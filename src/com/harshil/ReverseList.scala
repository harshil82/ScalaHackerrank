package com.harshil

object ReverseList {
  def main(args:Array[String]){
    println(f(List(4,88,6,5,2,22,66,44,92,356)))
  }
  def f(arr:List[Int]):List[Int] = arr.reverse
}