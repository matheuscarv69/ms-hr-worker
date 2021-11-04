package src.entities.worker.request

import io.swagger.annotations.ApiModelProperty
import src.entities.worker.model.Worker
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

class UpdateWorkerRequest(

    @ApiModelProperty(value = "Department", position = 1, required = true)
    @field:NotBlank
    @field:Size(max = 100)
    val department: String

) {

    fun toModel(workerId: Long) = Worker(
        id = workerId,
        department = this.department,
    )

}
