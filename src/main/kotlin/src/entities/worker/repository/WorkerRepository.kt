package src.entities.worker.repository

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import src.entities.worker.model.Worker

interface WorkerRepository : JpaRepository<Worker, Long> {

    fun findAllByActiveAndDepartment(
        active: Boolean,
        department: String,
        pageable: Pageable
    ): Page<Worker>

}