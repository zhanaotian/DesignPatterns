package jkwar.code.prototype;

public class Client01 {
  public static void main(String[] args) {
    //创建文档对象
    WordDkcument wordDkcument = new WordDkcument();
    //编辑文档
    wordDkcument.setmTest("清华字典");
    wordDkcument.addImages("图片1");
    wordDkcument.addImages("图片2");
    wordDkcument.addImages("图片3");
    wordDkcument.showDocument();
    //以原始文档为原型，拷贝一份副本 浅拷贝
    WordDkcument doc2 = wordDkcument.clone();
    System.out.println("----拷贝的文档对象-------");
    doc2.showDocument();
    //修改文档副本，由于浅拷贝不支持引用类型的成员变量的复制，只是引用其内存地址，所以修改副本图片，也会修改原始文档的图片列表
    doc2.setmTest("修改过的doc2文本");
    doc2.addImages("呵呵.png");
    System.out.println("----打印修改过的文档对象-------");
    doc2.showDocument();
    wordDkcument.showDocument();
  }
}
