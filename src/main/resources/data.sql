CREATE TABLE TEAM
(
    ID int,
    COACH text(50),
    YEAR int,
    constraint TEAM_PK
        primary key (ID)
);


create table PLAYER
(
    ID int auto_increment,
    NUMBER int,
    NAME TEXT(50),
    LASTNAME TEXT(50),
    POSITION TEXT(50),
    CAPTAIN BOOLEAN,
    ID_TEAM int,
    constraint PLAYER_PK
        primary key (ID),
    constraint PLAYER_TEAM_ID_FK
        foreign key (ID_TEAM) references TEAM (ID)
);

INSERT INTO TEAM (ID, COACH, YEAR) VALUES (1, 'Dominique Ducharme', 2019);
INSERT INTO TEAM (ID, COACH, YEAR) VALUES (2, 'Dominique Ducharme', 2020);

INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (31, 'Carey', 'Price', 'goaltender', false, 1);
INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (14, 'Nick', 'Suzuki', 'forward', false, 1);
INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (15, 'Jesperi', 'Kotkaniemi', 'forward', false, 1);
INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (71, 'Jake', 'Evans', 'forward', false, 1);
INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (27, 'Alexander', 'Romanov', 'defenseman', false, 1);
INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (6 , 'Shea', 'Weber', 'defenseman', true, 1);

INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (31, 'Carey', 'Price', 'goaltender', false, 2);
INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (14, 'Nick', 'Suzuki', 'forward', false, 2);
INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (15, 'Jesperi', 'Kotkaniemi', 'forward', false, 2);
INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (71, 'Jake', 'Evans', 'forward', false, 2);
INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (27, 'Alexander', 'Romanov', 'defenseman', false, 2);
INSERT INTO PLAYER (NUMBER, NAME, LASTNAME, POSITION, CAPTAIN, ID_TEAM) VALUES (6 , 'Shea', 'Weber', 'defenseman', true, 2);

COMMIT;