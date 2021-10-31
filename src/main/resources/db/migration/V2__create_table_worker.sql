create table hr_worker.worker
(
    id           bigserial    not null,
    department   varchar(100) not null,
    daily_income float        not null,
    active       bool         not null,

    primary key (id)
)