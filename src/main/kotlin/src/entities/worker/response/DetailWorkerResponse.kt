package src.entities.worker.response

import io.swagger.annotations.ApiModelProperty
import src.entities.worker.model.Worker
import java.math.BigDecimal

class DetailWorkerResponse(

    @ApiModelProperty(value = "id", position = 1)
    val id: Long,

    @ApiModelProperty(value = "department", position = 2)
    val department: String,

    @ApiModelProperty(value = "dailyIncome", position = 3)
    val dailyIncome: BigDecimal,

    @ApiModelProperty(value = "active", position = 4)
    val active: Boolean
) {

    constructor(worker: Worker) : this(
        id = worker.id!!,
        department = worker.department,
        dailyIncome = worker.dailyIncome,
        active = worker.active
    )

}
