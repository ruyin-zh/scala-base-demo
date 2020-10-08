package com.wsyt.base.scala.clazz.inner

/**
  *
  * @author ruyin_zh
  * @date 2020-10-08
  * @title 内部类
  * @description 在Scala中,一个类可以作为另一个类的成员,内部类是绑定到外部对象的;
  *             假如我们希望编译器在编译时阻止我们混淆节点nodes与图形graph的关系,路径依赖类型提供了一种解决方案;
  *
  */
class Graph {

  class Node {
    var connectedNodes:List[Node] = Nil

    def connectTo(node: Node)={
      if (!connectedNodes.exists(node.equals)){
        connectedNodes = node :: connectedNodes
      }
    }
  }

  var nodes:List[Node] = Nil
  def newNode:Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }

}

object Graph {

  def main(args: Array[String]): Unit = {
    val graph1 = new Graph
    val node1 = graph1.newNode
    val node2 = graph1.newNode
    val node3 = graph1.newNode

    node1.connectTo(node2)
    node3.connectTo(node1)


    val graph2 = new Graph
    val node4 = graph2.newNode
    //类型graph1.Node与类型graph2.Node完全不同,以下写法不合规
    //node4.connectTo(node2)
  }


}
