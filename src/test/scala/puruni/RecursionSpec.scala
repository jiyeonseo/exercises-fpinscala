package puruni

import org.scalatest.{FunSuite, Matchers}

/**
  * Created by jiyeon on 2016. 9. 19..
  */
class RecursionSpec extends FunSuite with Matchers{


  test("factorial") {
    // 4! == 24
    // 1 * 2 * 3 * 4 = 24
    // 꼬리 재귀함수
    Recursion.factorial1(4)

  }


}
