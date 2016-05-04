package com.harshil

import scala.collection.immutable.List

object ListReplication {
  def main(args:Array[String]){
    println(f(3,List(1,2,3,4)))
  }

 def f(num:Int,arr:List[Int]):List[Int] = arr flatMap { e => List.fill(num)(e) }
}