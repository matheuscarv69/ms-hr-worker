package src.entities.worker.model

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity(name = "Worker")
class Worker(

    @Id
    val id: Long?,

    @field:NotBlank
    @field:Size(max = 100)
    @Column(nullable = false)
    val department: String,

    @field:NotNull
    @field:Min(0)
    @Column(name = "daily_income", nullable = false)
    val dailyIncome: BigDecimal

) {

    @field:NotNull
    @Column(nullable = false)
    var active: Boolean = true
        private set

    fun enableUser(): Boolean {
        this.active = true
        return active
    }

    fun disableUser(): Boolean {
        this.active = false
        return active
    }

}