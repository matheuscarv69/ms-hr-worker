package src.entities.worker.controller

import io.swagger.annotations.Api
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import src.entities.worker.request.NewWorkerRequest
import src.entities.worker.usecase.NewWorkerUseCase


@Api(tags = ["Worker"])
@RestController
@RequestMapping("/v1/workers")
class WorkerController(
    @Autowired
    private val newWorkerService: NewWorkerUseCase
) {

    private val log = LoggerFactory.getLogger(this.javaClass)

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun createUserAndAssociateWithDepartment(
        @RequestBody request: NewWorkerRequest,
        uriBuilder: UriComponentsBuilder
    ): ResponseEntity<Void> {
        log.info("Receiving request for create user: ${request.userId} and associate with department: ${request.department} ")

        val worker = newWorkerService.createWorker(request.toModel())

        val uri = uriBuilder.path("/v1/workers/{workerId}").buildAndExpand(worker.id).toUri()

        return ResponseEntity.created(uri).build()
    }


}