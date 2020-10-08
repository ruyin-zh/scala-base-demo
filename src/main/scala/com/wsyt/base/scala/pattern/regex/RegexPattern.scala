package com.wsyt.base.scala.pattern.regex

import scala.util.matching.Regex

/**
  *
  * @author ruyin_zh
  * @date 2020-09-27
  * @title
  * @description
  *
  */
object RegexPattern {


  def main(args: Array[String]): Unit = {
    //.r 方法可使任意字符串变成一个正则表达式
    val numberPattern: Regex = "[0-9]".r

    numberPattern.findFirstMatchIn("awesomepassword") match {
      case Some(_) => println("PasswordOk")
      case None => println("Password must contain a number")
    }


    //可以使用括号来同时匹配多组正则表达式
    val keyValPattern: Regex = "([0-9a-zA-Z-#() ]+): ([0-9a-zA-Z-#() ]+)".r
    val margin: String =
      """background-color: #A03300;
        |background-image: url(img/header100.png);
        |background-position: top center;
        |background-repeat: repeat-x;
        |background-size: 2160px 108px;
        |margin: 0;
        |height: 108px;
        |width: 100%;""".stripMargin

    for (kv <- keyValPattern.findAllMatchIn(margin)){
      println(s"key: ${kv.group(1)}  value:${kv.group(2)}")
    }

  }

}
