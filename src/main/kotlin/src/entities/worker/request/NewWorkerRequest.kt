package src.entities.worker.request

import io.swagger.annotations.ApiModelProperty
import src.entities.worker.model.Worker
import java.math.BigDecimal
import javax.validation.constraints.*

data class NewWorkerRequest(

    @ApiModelProperty(value = "User Id", position = 1, required = true)
    @field:NotNull
    @field:Positive
    @field:Min(1)
    val userId: Long,

    @ApiModelProperty(value = "Department", position = 2, required = true)
    @field:NotBlank
    @field:Size(max = 100)
    val department: String,

    @ApiModelProperty(value = "Daily Income", position = 3, required = true)
    @field:NotNull
    @field:Positive
    val dailyIncome: BigDecimal,

    @ApiModelProperty(value = "Active", position = 4, required = true)
    @field:NotNull
    val active: Boolean


) {

    fun toModel() = Worker(
        id = this.userId,
        department = this.department,
        dailyIncome = this.dailyIncome,
        active = this.active
    )

}
