package online.whizzo.android.ui.chat
import online.whizzo.android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import java.util.ArrayList


class RecyclerViewAdapter(var myCards: ArrayList<ChatCard>) :
    RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val listItem: View = LayoutInflater.from(parent.context).inflate(R.layout.chatcards, parent, false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.username.text = myCards[position].chatName
        holder.lastMessage.text = myCards[position].lastMessage
        holder.messageTime.text = myCards[position].lastMessageTime
        holder.unreadCount.text = myCards[position].unreadCount.toString()
    }

    override fun getItemCount(): Int {
        return myCards.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val username: TextView = itemView.findViewById<View>(R.id.username) as TextView
        val lastMessage: TextView = itemView.findViewById<View>(R.id.lastMessage) as TextView
        val messageTime: TextView = itemView.findViewById<View>(R.id.messageTime) as TextView
        val unreadCount: TextView = itemView.findViewById<View>(R.id.unreadCount) as TextView

    }

}