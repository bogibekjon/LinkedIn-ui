package uz.data.linkedin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import uz.data.linkedin.R
import uz.data.linkedin.model.Post

class PostAdapter(val list: ArrayList<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = list[position]

        holder.apply {
            Picasso.get().load(post.profileImgUrl).into(ivProfile)
            Picasso.get().load(post.image).into(ivPost)
            tvPost.text = post.text
            tvPosition.text = post.position
            tvTime.text = post.time
            tvFullName.text = post.fullName

            if (post.isOnline) {
                ivOnline.visibility = View.VISIBLE
            } else {
                ivOnline.visibility = View.INVISIBLE
            }

        }
    }

    override fun getItemCount() = list.size


    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivProfile = view.findViewById<ImageView>(R.id.iv_profile)
        val ivOnline = view.findViewById<ImageView>(R.id.iv_online)
        val ivPost = view.findViewById<ImageView>(R.id.iv_post)
        val tvFullName = view.findViewById<TextView>(R.id.tv_fullName)
        val tvPosition = view.findViewById<TextView>(R.id.tv_position)
        val tvTime = view.findViewById<TextView>(R.id.tv_time)
        val tvPost = view.findViewById<TextView>(R.id.tv_post)

    }


}