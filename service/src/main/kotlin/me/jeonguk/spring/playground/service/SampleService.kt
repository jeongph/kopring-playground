package me.jeonguk.spring.playground.service

import domain.Sample
import me.jeonguk.spring.playground.entity.SampleEntity
import me.jeonguk.spring.playground.repository.SampleAddonRepository
import me.jeonguk.spring.playground.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
class SampleService(
    private val sampleRepository: SampleRepository,
    private val sampleAddonRepository: SampleAddonRepository
) {

    fun getHome(): List<Sample.SampleDto> = sampleAddonRepository.testQuery().map { it.toDto() }

    fun addHome() {
        sampleRepository.save(SampleEntity("test"))
    }

    private fun SampleEntity.toDto() = Sample.SampleDto(this.id, this.name)

}