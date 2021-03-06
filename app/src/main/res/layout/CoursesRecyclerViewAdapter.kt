package layout

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hello.Coursesactivity
import com.example.hello.R
import kotlinx.android.synthetic.main.row_courses_item.view.*

class CoursesRecyclerViewAdapter(val CoursesList: List<Coursesactivity>) :
    RecyclerView.Adapter<CoursesRecyclerViewAdapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_courses_item, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return CoursesList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvCourses.text = CoursesList[position].toString()
    }
    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}