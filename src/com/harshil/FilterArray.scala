package com.harshil

import sun.org.mozilla.javascript.internal.ast.Yield

object FilterArray {
  def main(args:Array[String]){
   
     println(f(3,List(10,9,8,2,7,5,1,3,0)))
  }
  
  def f(delim:Int,arr:List[Int]) = arr.filter { i => i<delim }
  
  def sum(args:Int*)={
    var result = 0
    for(arg<-args)result+=arg
    result;
  }
  
  def sumWithRecursive (args:Int*):Int={
    var result =0
    if(args.length==0) 0
    else args.head+ sumWithRecursive(args.tail:_*)
  }
} 