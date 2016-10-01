package puruni

import scala.annotation.tailrec

/**
  * Created by jiyeon on 2016. 9. 19..
  */
object Recursion {

  def fact(n:Int) : Int  = {
    // 1. 기본 값 구현 http://mathforum.org/dr.math/faq/faq.0factorial.html
    // 0! == 1
    if(n==0){
      1
    }
      // 2. 반복 부분에 대한 구현
    else {
      fact(n-1) * n // 값이 커지면 stackoverflow exception이 남
    }
  }

  // tailrec => stack : while
  def factorial1(n:Int) : Int  = {

    @tailrec
    def fact(n1: Int, acc:Int) : Int ={
      if(n1==0){
        acc
      }
      else {
        fact(n1-1, acc * n1)
      }
    }
    fact(n,1)
  }

  // factorial 방식의 loop
  def factorial2(n:Int) : Int = {
    var acc : Int = 1
    var n1 : Int = n

    while(n1 != 0 ) {
      acc = acc * n1
      n1 = n1 - 1
    }

    acc
  }

}
