package src.entities.worker.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity(name = "Worker")
class Worker(

    @Id
    @Column(nullable = false, unique = true)
    val id: Long?,

    @field:NotBlank
    @field:Size(max = 100)
    @Column(nullable = false)
    var department: String,

) {
    @field:NotNull
    @Column(nullable = false)
    var active: Boolean = true
        private set

    fun enableWorker(): Boolean {
        this.active = true
        return active
    }

    fun disableWorker(): Boolean {
        this.active = false
        return active
    }

}