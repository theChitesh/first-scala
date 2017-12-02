package com.test

import Run._

object TestRun{
  def main(args: Array[String]){

    4 times println("hello")

    println(add(3,2))
  }



  def add(a:Int ,b:Int ): Int ={

    var sum:Int = 0
    sum = a+ b
    return  sum
  }

}
