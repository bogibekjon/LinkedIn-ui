package uz.data.linkedin.model

data class Post(
    val profileImgUrl: String,
    val isOnline: Boolean,
    val fullName: String,
    val position: String,
    val time: String,
    val text: String,
    val image: String,
)
