package kg.example.homework4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private var mCounter = 0
    val counter = MutableLiveData<Int>()
    val text = MutableLiveData<ArrayList<String>>()
    val list = arrayListOf<String>()
    fun addition() {
        mCounter++
        counter.value = mCounter
        list.add("+ \n")
        text.value = list
    }

    fun subtraction() {
        counter.value = ++mCounter
        list.add("- \n")
        text.value = list
    }

}