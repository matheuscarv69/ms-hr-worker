create table hr_worker.worker
(
    id           bigserial    not null unique,
    department   varchar(100) not null,
    active       bool         not null,

    primary key (id)
)