package com.wsyt.base.scala.pattern

import scala.util.Random

/**
  *
  * @author ruyin_zh
  * @date 2020-09-21
  * @title
  * @description 模式匹配
  *
  */
object PatternMatch {


  def main(args: Array[String]): Unit = {
    val x: Int = Random.nextInt(10)

    //匿名方法
    val matchVal: String = x match {
      case 0 => "zero"
      case 1 => "one"
      case 2 => "two"
      case _ => "other"
    }

    println(x)
    println(matchVal)

    println(matchTest(x))

    val peopleSeq: Seq[String] = Seq("12345","NASA")

//    println(showNotification(Email("NASA","'go to moon'","I need you")))
//    println(showNotification(SMS("12345","Are you there?")))
//    println(showNotification(VoiceRecording("Tom","http://www.baidu.com")))
//    println(showNotification(new WeChat("12345","Are you there?")))

    println(showImportNotification(Email("NASA","'go to moon'","I need you"),peopleSeq))
    println(showImportNotification(SMS("12345","Are you there?"),peopleSeq))
    println(showImportNotification(VoiceRecording("Tom","http://www.baidu.com"),peopleSeq))
    println(showImportNotification(new WeChat("12345","Are you there?"),peopleSeq))



    println(goIdle(Phone("iOS")))
    println(goIdle(Computer("MAC Pro")))

    println(findPlaceToSit(Couch()))
    println(findPlaceToSit(Chair()))
  }


  def matchTest(x:Int) = x match {
    case 1 => "first"
    case 2 => "second"
    case _ => "last"
  }


  def showNotification(notification: Notification) = notification match {
    case Email(sender,title, _) => s"you got an email from $sender with title $title"
    case SMS(caller,message) => s"you got a SMS from $caller! Message: $message"
    case VoiceRecording(contactName,link) => s"you received a Voice Recording from $contactName! Click link to hear it:$link"
    //一般类无法使用模式匹配
    //case WeChat() => ""
    //兜底返回
    case _ => s"Can not find type $notification"
  }

  def showImportNotification(notification: Notification, importantPeople: Seq[String]) = notification match {

    //模式守卫
    case Email(sender, _, _) if importantPeople.contains(sender) => s"you got an email from special person:$sender"
    case SMS(caller, _) if importantPeople.contains(caller) => s"you got a SMS from special person:$caller!"
    case _ => showNotification(notification)

  }

  def goIdle(device: Device) = device match {
    case p: Phone => p.screenOn
    case c: Computer => c.screenSaverOn
    case _ => ""
  }

  def findPlaceToSit(piece: Furniture) = piece match {
    case Couch() => "Lie on the couch"
    case Chair() => "Sit on the chair"
  }

}



abstract class Notification

case class Email(sender: String,title: String,body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification

class WeChat(caller:String, message:String) extends Notification



//仅模式匹配
//当不同类型对象需要调用不同方法时,仅匹配类型的模式非常有用
abstract class Device

case class Phone(model: String) extends Device {
  def screenOn = "Turning screen on"
}

case class Computer(model: String) extends Device {
  def screenSaverOn = "Turning screen saver on"
}


//类使用sealed关键字修饰时,若在其他文件处继承则会报以下错误:
//illegal inheritance from sealed class Furniture
sealed abstract class Furniture

case class Couch() extends Furniture
case class Chair() extends Furniture

