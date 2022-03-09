package kg.example.homework4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private var mCounter = 0
    val counter = MutableLiveData<Int>()
    val text = MutableLiveData<String>()

    fun addition(){
        counter.value = ++mCounter
        text.value += "+ \n"
    }

fun subtraction(){
    counter.value = ++mCounter
    text.value += "- \n"
}

}