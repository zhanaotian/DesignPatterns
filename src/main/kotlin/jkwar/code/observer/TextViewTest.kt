package jkwar.code.observer


fun main(args: Array<String>) {
    val textView=TextView()
    textView.listener=PrintingTextChangedListener()
    textView.text="快跑啊"
  textView.text="怪兽来了"
}