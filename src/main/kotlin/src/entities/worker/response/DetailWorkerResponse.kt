package src.entities.worker.response

import io.swagger.annotations.ApiModelProperty
import src.entities.worker.model.Worker
import java.math.BigDecimal

class DetailWorkerResponse(

    @ApiModelProperty(value = "id", position = 1)
    val id: Long,

    @ApiModelProperty(value = "department", position = 2)
    val department: String,

    @ApiModelProperty(value = "active", position = 3)
    val active: Boolean
) {

    constructor(worker: Worker) : this(
        id = worker.id!!,
        department = worker.department,
        active = worker.active
    )

}
