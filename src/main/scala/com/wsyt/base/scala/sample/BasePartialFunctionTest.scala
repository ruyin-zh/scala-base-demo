package scala.com.wsyt.base.scala.sample

/**
 *
 * @author ruyin_zh
 * @date 2020-11-04
 * @title
 * @description
 *
 */
object BasePartialFunctionTest {

  def main(args: Array[String]): Unit = {

    def basePartialFunc: PartialFunction[Any, String] = {
      case "hello" => "val is hello"
      case x: Int => s"$x is Int"
      case _ => "none"
    }

    println(basePartialFunc(44))
    println(basePartialFunc("hello"))
    println(basePartialFunc(false))
  }
}
