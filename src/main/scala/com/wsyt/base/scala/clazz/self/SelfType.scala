package com.wsyt.base.scala.clazz.self

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 子类型
  * @description 子类型用于生命一个特质必须混入其他特质,尽管该特质没有直接扩展其他特质,这使得所依赖的成员可以在没有导入的情况下使用;
  *             子类型是一种细化this或this别名之类型的方法;
  *             要在特质当中使用子类型,写一个标识符,跟上要混入的另一个特质,以及=>
  *
  */
trait User {
  def username: String
}

trait Tweeter {
  //重新赋予this的类型
  this: User =>

  def tweet(tweetText:String) = println(s"$username: $tweetText")
}

class VerifiedTweeter(val username_ : String) extends Tweeter with User{
  override def username: String = s"real $username_"
}

object SelfType {

  def main(args: Array[String]): Unit = {
    val realWy = new VerifiedTweeter("wsyt")
    realWy.tweet("Just spilled my glass of lemonade")
  }

}
