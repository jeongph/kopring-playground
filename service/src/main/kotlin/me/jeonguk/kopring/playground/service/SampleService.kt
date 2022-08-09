package me.jeonguk.kopring.playground.service

import me.jeonguk.kopring.playground.domain.Sample
import me.jeonguk.kopring.playground.entity.SampleEntity
import me.jeonguk.kopring.playground.repository.SampleAddonRepository
import me.jeonguk.kopring.playground.repository.SampleRepository
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