package jkwar.code.observer
//具体观察者
class PrintingTextChangedListener : TextChangedListener{
  override fun onTextChanged(newText: String) {
    println("文本发生改变了: $newText")
  }
}