package ke.co.hello7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.r.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_registration.view.*


class CoursesRecyclerViewAdapter(val courseList: List<Course>
) :
    courses.Adapter<CoursesRecyclerViewAdapter.CoursesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_registration, parent, false)
        return CoursesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return courseList.size
    }


    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        holder.rowView.textView2.text = courseList[position].courseId
        holder.rowView.textView3.text = courseList[position].courseCode
        holder.rowView.textView4.text = courseList[position].courseName
        holder.rowView.textView5.text = courseList[position].description
        holder.rowView.textView6.text = courseList[position].instructor

    }

    class CoursesViewHolder(val rowView: View) : CoursesRecyclerViewAdapter.ViewHolder(rowView)
}