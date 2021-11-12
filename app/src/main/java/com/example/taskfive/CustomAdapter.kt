package com.example.taskfive

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter():RecyclerView.Adapter<CustomAdapter.MyHolder>() {
    var arrayList : ArrayList<Course> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(arrayList[position])
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.course_text)
        var desc: TextView = itemView.findViewById(R.id.course_web)

        fun bind(course: Course) {
            name.text = course.courseName
            desc.text = course.webName
        }

    }

     fun setData(arrayList: ArrayList<Course>) {
         this.arrayList = arrayList
         notifyDataSetChanged()
    }
}