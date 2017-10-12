package jkwar.code.prototype;

public class Client {
  public static void main(String[] args) {
    //创建文档对象
    WordDkcument wordDkcument=new WordDkcument();
    //编辑文档
    wordDkcument.setmTest("清华字典");
    wordDkcument.addImages("图片1");
    wordDkcument.addImages("图片2");
    wordDkcument.addImages("图片3");
    wordDkcument.showDocument();
    //以原始文档为原型，拷贝一份副本 浅拷贝
    WordDkcument doc2=wordDkcument.clone();
    System.out.println("----拷贝的文档对象-------");
    doc2.showDocument();
    //修改文档副本
    doc2.setmTest("修改过的doc2文本");
    System.out.println("----打印修改过的文档对象-------");
    doc2.showDocument();
    wordDkcument.showDocument();
  }
}
