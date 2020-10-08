package com.wsyt.base.scala.clazz

import com.wsyt.base.scala.clazz.pack._
/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title
  * @description
  *
  */
object PrintPlanted {


  def main(args: Array[String]): Unit = {
    for (fruit <- planted){
      showFruit(fruit)
    }
  }

}
