import org.junit.Test
import Post.*
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val testpost: Post = Post(
            id = 108867,
            ownerId = 100001,
            fromId = 100002,
            createdBy = 100042,
            date = 5042022,
            text = "Wazzuuup",
            replyOwnerId = 100042,
            replyPostId = 100042,
            comments = Comments(101, false, true, true, false),
            copyright = Copyright(100005, "link1", "name1", "type1"),
            likes = Likes(10000, true, true, true),
            reposts = Reposts(101, true),
            views = Views(33),
            postType = "post",
            signerId = 100088,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(
                isDonut = true,
                paidDuration = 300,
                placeholder = Placeholder(),
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 60
        )
        val checkId = WallService.add(testpost).id
        assertNotNull(checkId)
    }

    @Test
    fun update() {



        val post1: Post = Post(
            id = 0,
            ownerId = 100001,
            fromId = 100002,
            createdBy = 100042,
            date = 5042022,
            text = "Wazzuuup",
            replyOwnerId = 100002,
            replyPostId = 100002,
            comments = Comments(101, true, true, true, true),
            copyright = Copyright(100005, "link1", "name1", "type1"),
            likes = Likes(10000, true, true, true),
            reposts = Reposts(101, true),
            views = Views(74),
            postType = "post",
            signerId = 100088,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(
                isDonut = true,
                paidDuration = 300,
                placeholder = Placeholder(),
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 60
        )
        val post2: Post = Post(
            id = 1,
            ownerId = 100002,
            fromId = 100003,
            createdBy = 100042,
            date = 5042022,
            text = "Wazzuuup",
            replyOwnerId = 100002,
            replyPostId = 100002,
            comments = Comments(101, true, true, true, true),
            copyright = Copyright(100005, "link2", "name2", "type2"),
            likes = Likes(10001, true, true, true),
            reposts = Reposts(101, true),
            views = Views(27),
            postType = "post",
            signerId = 100088,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(
                isDonut = true,
                paidDuration = 300,
                placeholder = Placeholder(),
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 70
        )
        val post3: Post = Post(
            id = 0,
            ownerId = 100002,
            fromId = 100003,
            createdBy = 100042,
            date = 5042022,
            text = "Wazzuuup",
            replyOwnerId = 100002,
            replyPostId = 100002,
            comments = Comments(101, true, true, true, true),
            copyright = Copyright(100005, "link2", "name2", "type2"),
            likes = Likes(10001, true, true, true),
            reposts = Reposts(101, true),
            views = Views(34),
            postType = "post",
            signerId = 100188,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(
                isDonut = true,
                paidDuration = 300,
                placeholder = Placeholder(),
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 90
        )

        val service: WallService = WallService
        service.add(post1)
        assertTrue(service.update(post2))
        assertFalse(service.update(post3))
    }
}