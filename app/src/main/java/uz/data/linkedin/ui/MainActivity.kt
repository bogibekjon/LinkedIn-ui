package uz.data.linkedin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import uz.data.linkedin.R
import uz.data.linkedin.adapter.PostAdapter
import uz.data.linkedin.model.Post

class MainActivity : AppCompatActivity() {
    lateinit var list:ArrayList<Post>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        list=loadList()
        val recyclerView=findViewById<RecyclerView>(R.id.rv_post)
        recyclerView.adapter=PostAdapter(list)


    }

    private fun loadList(): java.util.ArrayList<Post> {
        val postList=ArrayList<Post>()
        postList.add(Post("https://i.insider.com/5a7c826f7101ad2323457b0d?width=1136&format=jpeg",true,"Povel Durov","CEO of Telegram","now","Telegram yangilandi slaram yangilab oling!!","https://telegram.org/file/464001599/11376/lKgoNItH6LU.33849/f746d770ab23a9b3bb"))
        postList.add(Post("https://i.insider.com/5a7c826f7101ad2323457b0d?width=1136&format=jpeg",true,"Povel Durov","CEO of Telegram","now","Telegram yangilandi slaram yangilab oling!!","https://telegram.org/file/464001599/11376/lKgoNItH6LU.33849/f746d770ab23a9b3bb"))
        postList.add(Post("https://i.insider.com/5a7c826f7101ad2323457b0d?width=1136&format=jpeg",false,"Povel Durov","CEO of Telegram","now","Telegram yangilandi slaram yangilab oling!!","https://telegram.org/file/464001599/11376/lKgoNItH6LU.33849/f746d770ab23a9b3bb"))
        postList.add(Post("https://i.insider.com/5a7c826f7101ad2323457b0d?width=1136&format=jpeg",true,"Povel Durov","CEO of Telegram","now","Telegram yangilandi slaram yangilab oling!!","https://telegram.org/file/464001599/11376/lKgoNItH6LU.33849/f746d770ab23a9b3bb"))
        postList.add(Post("https://i.insider.com/5a7c826f7101ad2323457b0d?width=1136&format=jpeg",false,"Povel Durov","CEO of Telegram","now","Telegram yangilandi slaram yangilab oling!!","https://telegram.org/file/464001599/11376/lKgoNItH6LU.33849/f746d770ab23a9b3bb"))
        postList.add(Post("https://i.insider.com/5a7c826f7101ad2323457b0d?width=1136&format=jpeg",true,"Povel Durov","CEO of Telegram","now","Telegram yangilandi slaram yangilab oling!!","https://telegram.org/file/464001599/11376/lKgoNItH6LU.33849/f746d770ab23a9b3bb"))
        return postList
    }
}