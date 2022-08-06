package me.jeonguk.spring.playground.repository

import me.jeonguk.spring.playground.entity.SampleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.stereotype.Repository

@Repository
interface SampleRepository : JpaRepository<SampleEntity, Long>, QuerydslPredicateExecutor<SampleEntity> {

}