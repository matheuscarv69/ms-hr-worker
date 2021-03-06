package src.entities.worker.request

import io.swagger.annotations.ApiModelProperty
import src.entities.worker.model.Worker
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

    ) {

    fun toModel() = Worker(
        id = this.userId,
        department = this.department,
    )

}
