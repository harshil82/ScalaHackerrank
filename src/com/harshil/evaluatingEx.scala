package com.harshil

import java.lang.Float


object evaluatingEx {
   
  def main (args:Array[String]){
    println(f(20.0000f))
  }
  
  def f(x:Float):Double={
   BigDecimal(createExp(x)).setScale(4, BigDecimal.RoundingMode.FLOOR).toDouble
  }
  
  def createExp(x:Float):Double={
    var ex:Double = 0;
    for(i<- 0 to 9)  ex = ex + (Math.pow(x.doubleValue(), i)/fact(i)) 
    ex
  }
  
  def fact(x:Double):Double={
    if(x==0) 1 else x*fact(x-1)
  }

}