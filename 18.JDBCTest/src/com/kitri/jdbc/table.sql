drop table jdbctest;
drop sequence jdbctest_no_seq;

CREATE TABLE jdbctest
(
	no number primary key,
	name varchar(12),
	id varchar(16),
	joindate date default sysdate
);

create sequence jdbctest_no_seq start with 1 increment by 1;