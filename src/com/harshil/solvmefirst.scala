package com.harshil

object solvmefirst {
   def main(args: Array[String]) {
        println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
    }
} 