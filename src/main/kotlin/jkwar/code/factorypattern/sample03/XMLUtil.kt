package jkwar.code.factorypattern.sample03

import org.w3c.dom.Document
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
fun getBean(name:String): Any? {
  try {
    //创建文档对象
    val dFactory = DocumentBuilderFactory.newInstance()
    val builder = dFactory.newDocumentBuilder()
    val doc: Document
    doc = builder.parse(File("config.xml"))

    //获取包含类名的文本节点
    val nl = doc.getElementsByTagName("className")
    val classNode = nl.item(1).firstChild
    val cName = classNode.nodeValue

    //通过类名生成实例对象并将其返回
    val c = Class.forName(name+ cName)
    val obj = c.newInstance()
    return obj
  } catch (e: Exception) {
    e.cause
    return null
  }

}
