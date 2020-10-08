package com.wsyt.base.scala.func

/**
  *
  * @author ruyin_zh
  * @date 2020-09-17
  * @title
  * @description 返回函数的函数
  *
  */
object FuncReturnFuncCase extends App {

  def urlBuilder(ssl: Boolean,domainName:String): (String,String) => String = {
    val schema = if(ssl) "https://" else "http://"
    (endpoint:String,query:String) => s"${schema}${domainName}/${endpoint}?${query}"
  }


  val domainName = "www.baidu.com"
  def getURL = urlBuilder(true,domainName)
  val endpoint = "user"
  val query = "id=1"

  val finalUrl = getURL(endpoint,query)
  println(finalUrl)
}
