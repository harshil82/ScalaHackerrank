package com.harshil

object HelloWorldNtimes {
  def main(args:Array[String]){
    f(10)
  }
  def f(n:Int)= for(i <- 1 to n) println("Hello World")
}