drop table color

drop table gremlins

create table color(
	id integer not null primary key,
	color text not null
)

insert into color(id, color) values(0, 'RED');
insert into color(id, color) values(1, 'ORANGE');
insert into color(id, color) values(2, 'YELLOW');
insert into color(id, color) values(3, 'GREEN');
insert into color(id, color) values(4, 'BLUE');
insert into color(id, color) values(5, 'VIOLET');

create table gremlins(
	name text not null,
	age integer not null,
	color_id integer not null,
	is_evil boolean,
	foreign key (color_id) references color(id)
)

select * from color

select * from gremlins
