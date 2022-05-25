create table t_book
(
    id integer auto_increment,
    title varchar(50),
    author varchar(50),
    isbn integer,
    release_date varchar(50),
    primary key(id)
);
create table t_people
(
    id integer auto_increment,
    firstname varchar(50),
    lastname varchar(50),
    age integer,
    primary key(id)
);
create table t_read
(
    id integer auto_increment,
    id_book integer,
    id_people integer,
    reading_date varchar(50),
    primary key(id),
    foreign key (id_book) references t_book(id),
    foreign key (id_people) references t_people(id)
)