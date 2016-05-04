package com.harshil

object ArrayOfnElement {
  def main(args:Array[String]){
    println(f(5))
  }
  def f(num:Int) : List[Int] = List.range(1, num+1)
}