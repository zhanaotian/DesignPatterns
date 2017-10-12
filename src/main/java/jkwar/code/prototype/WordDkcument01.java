package jkwar.code.prototype;

import java.util.ArrayList;

/**
 * 文档类型，扮演ConcreatePrototype 角色，而cloneable代表prototype 角色
 */
public class WordDkcument01 implements Cloneable {
  //文本
  private String mTest;
  //图片
  private ArrayList<String> mImages = new ArrayList<String>();

  public WordDkcument01() {
    System.out.println("-----WordDkcument构造函数------");
  }

  protected WordDkcument01 clone() {
    try {
      WordDkcument01 doc = (WordDkcument01) super.clone();
      doc.mTest = this.mTest;
      //对mImages对象也调用clone()函数，进行深拷贝。
      doc.mImages = (ArrayList<String>) this.mImages.clone();
      return doc;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  public String getmTest() {
    return mTest;
  }

  public void setmTest(String mTest) {
    this.mTest = mTest;
  }

  public ArrayList<String> getmImages() {
    return mImages;
  }

  public void addImages(String mImages) {
    this.mImages.add(mImages);
  }

  /**
   * 打印文档内容
   */
  public void showDocument() {
    System.out.println("------Word Content Start----------");
    System.out.println("Text :" + mTest);
    System.out.println("Image List:");
    for (String imgName : mImages) {
      System.out.println("image name:" + imgName);
    }
    System.out.println("------Word Content End----------");
  }
}
