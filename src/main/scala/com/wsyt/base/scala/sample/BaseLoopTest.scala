package scala.com.wsyt.base.scala.sample

/**
 *
 * @author ruyin_zh
 * @date 2020-11-04
 * @title
 * @description
 *
 */
object BaseLoopTest extends App {

  for (i <- 1 to 9; j <- 1 to 9 if (j <= i)) {
    if (j <= i) print(s"$i * $j = ${i * j}\t")
    if (j == i) println()
  }

  val seq = for (i <- 1 to 10) yield {
    val x = 8
    i + x
  }
  println(seq)

  for (i <- seq) {
    println(i)
  }

  private val value: IndexedSeq[Int] = for (i <- 10 to 100) yield i
  println(value)
}
