package com.harshil

object UpdateList {
  def main(args: Array[String]) {
       println(updateList(List(-1,-2,-3,4,5,-6)))

  }

  def updateList(arr: List[Int]): List[Int] = arr.map { e => if (e < 0) -e else e }
}