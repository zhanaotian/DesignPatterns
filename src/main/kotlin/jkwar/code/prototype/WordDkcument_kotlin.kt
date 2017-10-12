package jkwar.code.prototype


data class WordDkcument_kotlin(var mTest: String?, var mImages: Array<String>) {
  fun showDocument() {
    println("------Word Content Start----------")
    println("Text :" + mTest)
    println("Image List:")
    for (image in mImages) {
      println(image)
    }
    println("------Word Content End----------")
  }

}