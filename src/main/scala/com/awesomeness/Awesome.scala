package com.awesomeness

class Awesomeness {
  def main(args: Array[String]) {
    println("Hello, world! " + args.toList)
  }
  def square(x:Int): Int= {
    x*x
  }
  def multiple(x:Int,y:Int): Int= {
    x*y
  }
  def divide(x:Int, y:Int): Int = {
    x/y
  }
  def add(x:Int, y:Int): Int = {
    x+y
  }
  def subtract(x:Int, y:Int): Int = {
    x-y
  }
  def add1(x:Int): Int ={
    x+1
  }

}


object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world! " + args.toList)
  }
}
