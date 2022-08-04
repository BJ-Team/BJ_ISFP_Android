package com.example.data.remote.url

object IsFpApiUrl {
    object User {
        const val login = "user/token"
        const val register = "user/register"
        const val nameOverlapCheck = "user/name"
        const val patchMyLocation = "user/Place"
        const val patchPassword = "user/password"
    }

    object Auth {
        const val refreshToken = "auth"
    }

    object Post {
        const val post = "post"
        const val editPost = "post/{post-id}"
        const val wishPost = "post/wish/{post-id}"
        const val reportPost = "post/report"
    }

    object MyPage {
        const val wishPost = "mypage/wished"
        const val sellList = "mypage/sold"
        const val myPage = "mypage"
        const val buyList = "mypage/bought"
    }

    object Profile {
        const val wishPost = "profile/wished"
        const val sellList = "profile/sold"
        const val myPage = "profile"
        const val buyList = "profile/bought"
    }

    object DailyLife {
        const val dailyLifePost = "life"
        const val editDailyLifePost = "life/{life-id}"
    }
}