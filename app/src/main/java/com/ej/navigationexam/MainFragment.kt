package com.ej.navigationexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class MainFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val action = MainFragmentDirections.actionMainFragmentToSecondFragment("hello!!!")

        view.findViewById<Button>(R.id.button).setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.secondFragment)
            Navigation.findNavController(view).navigate(action)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {

            }
    }
}