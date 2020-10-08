package com.wsyt.base.scala.singleton

/**
  *
  * @author ruyin_zh
  * @date 2020-09-21
  * @title
  * @description 伴生对象包含工厂方法
  *              类和它的半生对象必须定义在同一个原文件里
  *
  */
class Email(val username:String,val domainName:String)


object Email {


  def fromString(email: String) = {
    val sides: Array[String] = email.split("@")
    sides match {
      case Array(a,b) => Some(new Email(a,b))
      case _ => None
    }
  }


  def main(args: Array[String]): Unit = {
    val maybeEmail: Option[Email] = Email.fromString("xxx@gmail.com")
    maybeEmail match {
        case Some(email) => println(
          s"""Registered an email
             | Username: ${email.username}
             | Domain name: ${email.domainName}
          """)
        case None => println("Error: could not parse email")
    }
  }
}


