import Post.Post
import org.hamcrest.core.AnyOf

object WallService {
    private var posts = emptyArray<Post>()
    private var checkId: Post? = null

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun getValue(post: Post): Any{
        post.let {
            return field  }

    }

    fun likeById(id: Int) {
        for ((index, Post) in posts.withIndex()) if (Post.id == id) {
            val post: Post = Post.copy(Post.id, likes = Post.likes.copy( count = Post.likes.count + 1))
            posts[index] = post
        }
    }

    fun update(post: Post): Boolean {

        for ((index,Post) in posts.withIndex())
        {
            if (Post.id == post.id) {
                posts[index] = post.copy()
                return true
            }
        }
        return false
    }

    //fun SetPostType(type: String){
    //    val arrayType = arrayOf("post", "copy", "reply", "postpone", "suggest")
    //    for ((id) in posts.asList()){
    //        if (arrayType.contains(type)){
    //        posts[id].postType = type
    //        }
    //    }
    //}

    fun toString(num: Int): String {
        val check = num - 1
        val post : Post = posts[check]
        return post.toString()
    }
}