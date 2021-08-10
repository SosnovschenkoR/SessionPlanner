-- begin SESSIONPLANNER_SPEAKER
create table SESSIONPLANNER_SPEAKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMAIL varchar(255) not null,
    LAST_NAME varchar(255),
    FIRST_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end SESSIONPLANNER_SPEAKER
-- begin SESSIONPLANNER_SESSION
create table SESSIONPLANNER_SESSION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    END_DATE timestamp,
    START_DATE timestamp not null,
    TOPIC varchar(255) not null,
    DESCRIPTION varchar(2000),
    SPEAKER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end SESSIONPLANNER_SESSION