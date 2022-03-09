package kg.example.homework4.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.example.homework4.ui.AdditionFragment
import kg.example.homework4.ui.OperationFragment
import kg.example.homework4.ui.ResultFragment

class MyAdapter(fragment:FragmentActivity):FragmentStateAdapter(fragment) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 ->{
                OperationFragment()
            }
            1 ->{
                AdditionFragment()
            }
            2 ->{
                ResultFragment()
            }else->{
                OperationFragment()
            }
        }
    }
}