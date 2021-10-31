package src.entities.worker.request

import io.swagger.annotations.ApiModelProperty
import src.entities.worker.model.Worker
import java.math.BigDecimal
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Positive
import javax.validation.constraints.Size

class UpdateWorkerRequest(

    @ApiModelProperty(value = "Department", position = 1, required = true)
    @field:NotBlank
    @field:Size(max = 100)
    val department: String,

    @ApiModelProperty(value = "Daily Income", position = 2, required = true)
    @field:NotNull
    @field:Positive
    val dailyIncome: BigDecimal

) {

    fun toModel(workerId: Long) = Worker(
        id = workerId,
        department = this.department,
        dailyIncome = this.dailyIncome,
    )

}
