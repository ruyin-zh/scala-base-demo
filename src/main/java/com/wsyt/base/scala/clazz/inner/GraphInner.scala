package com.wsyt.base.scala.clazz.inner

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 内部类
  * @description Scala中若希望不同对象的内部类可以相互表示,需要在引用时使用#来表示,即GraphInner#Node;
  *
  */
class GraphInner {

  class Node {

    var connectedNodes:List[GraphInner#Node] = Nil

    def connectTo(node: GraphInner#Node): Unit ={
      if (!connectedNodes.exists(node.equals)){
        connectedNodes = node :: connectedNodes
      }
    }
  }

  var nodes:List[Node] = Nil

  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }

}

object GraphInner {


  def main(args: Array[String]): Unit = {
    val graph1 = new GraphInner
    val node1 = graph1.newNode
    val node2 = graph1.newNode
    node1.connectTo(node2)

    val graph2 = new GraphInner
    val node3 = graph2.newNode
    node1.connectTo(node3)
  }

}