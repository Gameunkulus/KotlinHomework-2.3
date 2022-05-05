
abstract class Attachments (val type: String)

data class VideoAttachment(
    val id: Int,
    val videoUrl: String
): Attachments("video")

data class PhotoAttachment(
val id: Int,
val photoUrl: String
): Attachments("photo")

fun showAttachment(attachments: Attachments){
    when(attachments.type){
        "video"->(attachments as VideoAttachment).videoUrl
        "photo"->(attachments as PhotoAttachment).photoUrl
    }

}

/*
{
    "attachments": [
    {
        "type": "photo",
        "photo": {
        "id": 1,
        "album_id": 1,
        "owner_id": 1,
        "user_id": 1
    }
    }, {
    "type": "video",
    "video": {
        "id": 1,
        "album_id": 1,
        "owner_id": 1,
        "user_id": 1
    }
}
    ]
}
*/