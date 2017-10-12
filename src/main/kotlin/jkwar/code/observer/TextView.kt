package jkwar.code.observer

import kotlin.properties.Delegates

//具体主题类
class TextView {
  var listener: TextChangedListener? = null

  var text:String by Delegates.observable(""){
    //委托属性
    property, oldValue, newValue ->  listener?.onTextChanged(newValue)
  }
}