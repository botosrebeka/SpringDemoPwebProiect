create table t_book
(
    idb integer auto_increment,
    title varchar(50),
    author varchar(50),
    isbn varchar(20),
    release_date varchar(50),
    gener varchar(50),
    page_number int,
    series varchar(50),
    primary key(idb)
);
create table t_people
(
    idp integer auto_increment,
    firstname varchar(50),
    lastname varchar(50),
    age integer,
    primary key(idp)
);
create table t_read
(
    idr integer auto_increment,
    id_book integer,
    id_people integer,
    start_date varchar(50),
    end_date varchar(50),
    primary key(idr),
    foreign key (id_book) references t_book(idb),
    foreign key (id_people) references t_people(idp)
)