package com.example.taskfive.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.taskfive.Course
import com.example.taskfive.CustomAdapter
import com.example.taskfive.R
import com.example.taskfive.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var customAdapter: CustomAdapter
    private var _binding: FragmentHomeBinding? = null
    private lateinit var  arrayList:ArrayList<Course>

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arrayList = ArrayList()
        customAdapter = CustomAdapter()
        data()
        customAdapter.setData(arrayList)
        binding.recycle.adapter = customAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun data(){
        arrayList.add(Course("HTML, CSS, and Javascript for Web Developers","Coursera"))
        arrayList.add(Course("Code Yourself! An Introduction to Programming","Coursera"))
        arrayList.add(Course("Computer Science: Programming with a Purpose","Coursera"))
        arrayList.add(Course("Learn to Program: The Fundamentals","Coursera"))
        arrayList.add(Course("Marketing Digital","Coursera"))
        arrayList.add(Course("The Strategy of Content Marketing","Coursera"))
        arrayList.add(Course("CS50: Introduction to Computer Science","Harvard"))
        arrayList.add(Course("Introduction to Bioconductor","Harvard"))
        arrayList.add(Course("Advanced Bioconductor","Harvard"))
        arrayList.add(Course("Introduction to Linear Models and Matrix Algebra","Harvard"))

    }
}