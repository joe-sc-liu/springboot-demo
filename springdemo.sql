


CREATE TABLE IF NOT EXISTS public.classroom(
        id serial primary key,
        name varchar(255),
        createdate timestamp with time zone default current_timestamp,
        modifydate timestamp with time zone,
        creatoraccountid integer NOT NULL,
        modifieraccountid integer NULL,
        enable boolean NOT NULL default true
	);

CREATE TABLE IF NOT EXISTS public.student(
        id serial primary key,
        name varchar(25),
        email varchar(64),
        age integer NOT NULL,
        birthday timestamp with time zone,
        createdate timestamp with time zone default current_timestamp,
        modifydate timestamp with time zone,
        creatoraccountid integer NOT NULL,
        modifieraccountid integer NULL,
        enable boolean NOT NULL default true
	);

CREATE TABLE IF NOT EXISTS public.teacher(
        id serial primary key,
        name varchar(25),
        email varchar(64),
        age integer NOT NULL,
        birthday timestamp with time zone,
        createdate timestamp with time zone default current_timestamp,
        modifydate timestamp with time zone,
        creatoraccountid integer NOT NULL,
        modifieraccountid integer NULL,
        enable boolean NOT NULL default true
	);












