package com.wsyt.base.scala.func

/**
  *
  * @author ruyin_zh
  * @date 2020-09-17
  * @title
  * @description 使用高阶函数的SalaryRaiser,告诫函数可减少冗余代码
  *
  */
object SalaryRaiserAsParam extends App {

  private def promotion(salaries: List[Double], rate: Double => Double): List[Double] = {
    salaries.map(rate)
  }

  def smallPromotion(salaries: List[Double]):List[Double] = {
    promotion(salaries,salary => salary * 1.1)
  }

  def greatPromotion(salaries: List[Double]): List[Double] = {
    promotion(salaries,salary => salary * math.log(salary))
  }

  def hugePromotion(salaries: List[Double]): List[Double] = {
    promotion(salaries,salary => math.pow(salary,2))
  }

  override def main(args: Array[String]): Unit = {
    val salaries = List(23.4,24.5,25.6,26.7)
    println(smallPromotion(salaries))
    println(greatPromotion(salaries))
    println(hugePromotion(salaries))
  }
}
