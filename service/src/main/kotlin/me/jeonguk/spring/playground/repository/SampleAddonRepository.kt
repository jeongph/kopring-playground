package me.jeonguk.spring.playground.repository

import com.querydsl.jpa.impl.JPAQueryFactory
import me.jeonguk.spring.playground.entity.QSampleEntity.sampleEntity
import org.springframework.stereotype.Repository

@Repository
class SampleAddonRepository(
    private val jpaQueryFactory: JPAQueryFactory
) {

    fun testQuery() = jpaQueryFactory.selectFrom(sampleEntity).fetch()

}