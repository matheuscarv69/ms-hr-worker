package src.entities.worker.usecase

import src.entities.worker.model.Worker

interface UpdateWorkerUseCase {

    fun updateWorker(workerDomain: Worker)

}
