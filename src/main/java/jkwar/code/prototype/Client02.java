package jkwar.code.prototype;

public class Client02 {
  public static void main(String[] args) {
    //创建文档对象
    WordDkcument01 wordDkcument = new WordDkcument01();
    //编辑文档
    wordDkcument.setmTest("清华字典");
    wordDkcument.addImages("图片1");
    wordDkcument.addImages("图片2");
    wordDkcument.addImages("图片3");
    wordDkcument.showDocument();
    //以原始文档为原型，拷贝一份副本 浅拷贝
    WordDkcument01 doc2 = wordDkcument.clone();
    System.out.println("----拷贝的文档对象-------");
    doc2.showDocument();
    //修改文档副本，WordDkcument01对引用类型进行了
    doc2.setmTest("修改过的doc2文本");
    doc2.addImages("呵呵.png");
    System.out.println("----打印修改过的文档对象-------");
    doc2.showDocument();
    wordDkcument.showDocument();
  }
}
