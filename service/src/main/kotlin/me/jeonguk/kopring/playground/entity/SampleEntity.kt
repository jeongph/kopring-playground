package me.jeonguk.kopring.playground.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "samples")
class SampleEntity(
    var name: String
) {

    @Id
    @GeneratedValue
    var id: Long = 0L

}