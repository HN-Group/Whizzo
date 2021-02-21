package online.whizzo.android.ui.dashboard;
import online.whizzo.android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import online.whizzo.android.ui.dashboard.Entities.CourseCard
import org.w3c.dom.Text
import java.util.ArrayList


class PostScreen(var myCards: ArrayList<CourseCard>) :
        RecyclerView.Adapter<PostScreen.MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val listItem: View = LayoutInflater.from(parent.context).inflate(R.layout.course_card, parent, false)
        return MyViewHolder(listItem)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = myCards[position].title
        holder.description.text = myCards[position].description
        }

        override fun getItemCount(): Int {
        return myCards.size
        }

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById<View>(R.id.title) as TextView
        val description: TextView = itemView.findViewById<View>(R.id.desciption) as TextView
}

}
