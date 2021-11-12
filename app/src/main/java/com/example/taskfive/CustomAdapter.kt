package com.example.taskfive

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val context: Context?):RecyclerView.Adapter<CustomAdapter.MyHolder>() {
    var arrayList : ArrayList<Course> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(arrayList[position],context)

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.course_text)
        var desc: TextView = itemView.findViewById(R.id.course_web)
        var layout:ConstraintLayout = itemView.findViewById(R.id.constraint)
        fun bind(course: Course,context: Context?) {
            name.text = course.courseName
            desc.text = course.webName
           layout.setBackgroundResource(course.imageId)
            layout.setOnClickListener {
                if (context != null) {
                    context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(course.url)))
                }
            }
        }

    }

     fun setData(arrayList: ArrayList<Course>) {
         this.arrayList = arrayList
         notifyDataSetChanged()
    }
}