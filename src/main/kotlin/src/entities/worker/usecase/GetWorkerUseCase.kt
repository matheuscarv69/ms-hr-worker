package src.entities.worker.usecase

import src.entities.worker.model.Worker

interface GetWorkerUseCase {

    fun getWorkerById(workerId: Long): Worker

}
