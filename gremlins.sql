drop table color

drop table gremlins

create table color(
	id integer not null primary key,
	color text not null
)

create table gremlins(
	name text not null,
	age integer not null,
	color_id integer not null,
	is_evil boolean,
	foreign key (color_id) references color(id)
)