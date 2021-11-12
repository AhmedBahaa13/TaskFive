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
        customAdapter = CustomAdapter(context)
        data()
        customAdapter.setData(arrayList)
        binding.recycle.adapter = customAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun data(){
        arrayList.add(Course("Kotlin In Android","Youtube",R.drawable.kotlin,"https://www.youtube.com/playlist?list=PLF8OvnCBlEY2w-zdVPozupapiKzLzpyUZ"))
        arrayList.add(Course("HTML, CSS, and Javascript for Web Developers","Coursera",R.drawable.html_course,"https://www.coursera.org/learn/html-css-javascript-for-web-developers"))
        arrayList.add(Course("Code Yourself! An Introduction to Programming","Coursera",R.drawable.codeyourself,"https://www.coursera.org/learn/intro-programming"))
        arrayList.add(Course("Computer Science: Programming with a Purpose","Coursera",R.drawable.introcslogo,"https://www.coursera.org/learn/cs-programming-java"))
        arrayList.add(Course("Learn to Program: The Fundamentals","Coursera",R.drawable.large_icon,"https://www.coursera.org/learn/learn-to-program"))
        arrayList.add(Course("Marketing Digital","Coursera",R.drawable.markiting,"https://www.coursera.org/learn/estrategia-marketing-digital"))
        arrayList.add(Course("The Strategy of Content Marketing","Coursera",R.drawable.content_markiting,"https://www.coursera.org/learn/content-marketing"))
        arrayList.add(Course("CS50: Introduction to Computer Science","Harvard",R.drawable.cs50,"https://online-learning.harvard.edu/course/cs50-introduction-computer-science?delta=0"))
        arrayList.add(Course("Introduction to Bioconductor","Harvard",R.drawable.bioconductor,"https://online-learning.harvard.edu/course/data-analysis-life-sciences-5-introduction-bioconductor-annotation-and-analysis-genomes-and?delta=0"))
        arrayList.add(Course("Advanced Bioconductor","Harvard",R.drawable.bioconductor,"https://online-learning.harvard.edu/course/data-analysis-life-sciences-6-high-performance-computing-reproducible-genomics?delta=0"))

    }
}