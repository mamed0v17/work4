package kg.example.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.example.homework4.adapters.MyAdapter
import kg.example.homework4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }
    private fun initView(){
        adapter = MyAdapter(this)
        binding.apply {
            viewPager.adapter = adapter
        }
    }
}