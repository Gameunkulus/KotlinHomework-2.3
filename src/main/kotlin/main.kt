import Post.*

fun main() {

    val post1: Post = Post(
        id = 100001,
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
        views = Views(88),
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
        id = 100001,
        ownerId = 100002,
        fromId = 100003,
        createdBy = 100086,
        date = 6042022,
        text = "Wazzuuuuuuup",
        replyOwnerId = 100002,
        replyPostId = 100002,
        comments = Comments(101, true, true, true, true),
        copyright = Copyright(100005, "link2", "name2", "type2"),
        likes = Likes(10001, true, true, true),
        reposts = Reposts(101, true),
        views = null,
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
    val service: WallService = WallService

    service.add(post1)
    println(service.toString(1))
    service.update(post2)
    println(service.toString(1))
    //WallService.add(post1)
    //WallService.add(post2)
    //println(WallService.toString(2))
    //WallService.likeById(100002)
    //println(WallService.toString(2))с
}