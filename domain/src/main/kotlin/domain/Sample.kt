package domain

import com.querydsl.core.annotations.QueryProjection


object Sample {

    class SampleDto @QueryProjection constructor(
        var id: Long,
        var name: String
    )

    class SampleAddReq(
        var name: String
    )

}