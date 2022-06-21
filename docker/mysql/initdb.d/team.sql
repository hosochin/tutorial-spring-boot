create table team (team_id int NOT NULL, team_name varchar(20) NOT NULL, user_id int NOT NULL, PRIMARY KEY(team_id, user_id));

insert into team VALUES (1, "チームA", 1);
insert into team VALUES (1, "チームA", 2);
insert into team VALUES (1, "チームA", 3);