alter table SESSIONPLANNER_SESSION alter column END_DATE rename to END_DATE__U36583 ^
alter table SESSIONPLANNER_SESSION add column DURATION integer ^
update SESSIONPLANNER_SESSION set DURATION = 0 where DURATION is null ;
alter table SESSIONPLANNER_SESSION alter column DURATION set not null ;
alter table SESSIONPLANNER_SESSION alter column DESCRIPTION set data type longvarchar ;
