package com.wsyt.base.scala.clazz

/**
  *
  * @author ruyin_zh
  * @date 2020-09-21
  * @title
  * @description
  *
  */
object CaseClassTour {

  /**
    *
    *
    *
    * */
  def main(args: Array[String]): Unit = {
    //案例类初始化时可不使用new关键字,因为案例类有一个默认的apply方法来负责对象的创建
    val book = Book("978-0486282114")
    println(book)

    val msg1 = Message("xxx@outlook.com","xxx@126.com","good good study")
    val msg2 = Message("xxx@outlook.com","xxx@126.com","good good study")
    println(msg1.sender)
    //虽然msg1与msg2是两个类,不过案例类的比较是进行值对比,故此返回值为true
    println(msg1 == msg2)

    //默认情况下案例类构造函数中参数由val修饰,表示不可变,因此以下赋值将不被允许,若希望可修改,可以在构造函数中使用var修饰变量
    //message.body = "day day up"


    //拷贝
    val msg3 = Message("xx1@outlook.com","xx1@126.com","good good study")
    //默认全部字段复制,拷贝为深拷贝
    val msg4 = msg3.copy()

    msg3.recipient = "xx3@126.com"
    msg3.body = "bbb"

    //可以指定字段进行复制
    val msg5 = msg3.copy(recipient = "xx2@126.com")
    println(msg4)
    println(msg5)
  }
}

//案例类允许无参构造函数
case class Producer(){


}

case class Book(isbn: String){

}

case class Message(sender: String,var recipient: String,var body: String){

  //默认的apply方法负责初始化对象
  //def apply(sender: String, recipient: String, body: String): Message = new Message(sender, recipient, body)
}
