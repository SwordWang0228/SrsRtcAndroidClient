package com.shencoder.srs_rtc_android_client.helper.call.bean

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

/**
 *
 * @author  ShenBen
 * @date    2022/1/27 10:13
 * @email   714081644@qq.com
 */
@Parcelize
@JsonClass(generateAdapter = true)
data class ResPlayStreamListBean(
    /**
     * 拉流集合
     */
    @Json(name = "streamList")
    val streamList: List<ResPlayStreamBean>,
    /**
     * 房间号
     */
    @Json(name = "roomId")
    val roomId: String
) : Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class ResPlayStreamBean(
    /**
     * 客户端信息
     */
    @Json(name = "userInfo")
    val userInfo: ClientInfoBean,
    /**
     * 推流地址
     */
    @Json(name = "publishStreamUrl")
    val publishStreamUrl: String
) : Parcelable