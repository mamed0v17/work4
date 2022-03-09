package kg.example.homework4.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kg.example.homework4.viewmodel.SharedViewModel
import kg.example.homework4.databinding.FragmentOperationBinding

class OperationFragment : Fragment() {
    private lateinit var binding: FragmentOperationBinding
    private lateinit var model: SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentOperationBinding.inflate(inflater)
        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            plus.setOnClickListener {
                model.addition()
            }
            minus.setOnClickListener {
                model.subtraction()
            }
        }
    }

}