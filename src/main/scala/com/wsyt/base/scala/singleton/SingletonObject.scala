package com.wsyt.base.scala.singleton
import com.wsyt.base.scala.singleton.logging.Logger

/**
 *
 * @author ruyin_zh
 * @date 2020-09-21
 * @title
 * @description 
 *
 */
class Project(name:String, dayToComplete:Int)

class Test{

  //
  val p1 = new Project("TPS Reports", 1)
  val p2 = new Project("Website redesign", 5)
  //引用单例类方法,类似于使用static修饰的静态方法
  Logger.info("Created projects")



  //两个对象调用的将是不同的NutritionInfo对象
  val milk: Milk = new Milk()
  val juice: OrangeJuice = new OrangeJuice()


}



object Test {

  def main(args: Array[String]): Unit = {
    //两个对象调用的将是不同的NutritionInfo对象
    val milk: Milk = new Milk()
    val juice: OrangeJuice = new OrangeJuice()
    println(milk.NutritionInfo == juice.NutritionInfo)


    val circle: Circle = new Circle(2)
    println(circle.area)
  }
}


//NutritionInfo定义在Milk中
class Milk {

  object NutritionInfo

}

//NutritionInfo定义在OrangeJuice中
class OrangeJuice {

  object NutritionInfo
}