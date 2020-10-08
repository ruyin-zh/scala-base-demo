package com.wsyt.base.scala.clazz.derivation

/**
  *
  * @author ruyin_zh
  * @date 2020-09-27
  * @title
  * @description for表达式推导
  *
  */
object ForExpressionDerivation {

  /**
    *
    * scala提供了轻量级的标记方法用来表示序列推导;
    * 基本形式:for (enumerators) yield e, enumerators指一组以分号分隔的枚举器;
    * 一个enumerators要么是一个产生新变量的生成器,要么是一个过滤器;
    * for表达式会在生成器的每一次绑定中计算e的值,并在循环结束后返回这些值组成的序列;
    *
    * */

  def main(args: Array[String]): Unit = {

    val userList = List(User("Travis",28),User("Kelly",33),User("Jennifer",44),User("Dennis",23))
    //user <- userList是生成器,if user.age > 20 && user.age < 30 是过滤器
    val nameList: List[String] = for (user <- userList if user.age > 20 && user.age < 30) yield user.name

    nameList.foreach(println)


    foo(10,10).foreach({
      case (i,j) => println(s"($i,$j)")
    })

  }

  def foo(n:Int, m:Int) = for (i <- 0 until n; j <- i until n if i + j == m) yield (i,j)
}


case class User(name:String,age:Int)