package src.entities.worker.controller

import io.swagger.annotations.Api
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@Api(tags = ["Worker"])
@RestController
@RequestMapping("/v1/workers")
class WorkerController {

    private val log = LoggerFactory.getLogger(this.javaClass)

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun createUserAndAssociateWithDepartment(
        @RequestBody request: String
    ): ResponseEntity<Void> {
        log.info("Receiving request for create user: ${request} and associate with department: ${request} ")

        return ResponseEntity.ok().build();
    }


}