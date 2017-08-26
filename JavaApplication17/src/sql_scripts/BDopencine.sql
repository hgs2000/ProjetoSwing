DROP SCHEMA if exists Opencine ;
CREATE DATABASE Opencine;
USE Opencine;
CREATE TABLE filmes (
    nome_filme VARCHAR(100) NOT NULL,
    des_filme VARCHAR(350) NOT NULL,
    gen_filme VARCHAR(50) NOT NULL,
    ano_filme INT NOT NULL,
    id_filme INT PRIMARY KEY AUTO_INCREMENT 
);

CREATE TABLE sala (
    cod_sala INT PRIMARY KEY,
    nome_sala VARCHAR(100)
);

CREATE TABLE sessao (
    id_filme INT NOT NULL,
    cod_sala INT NOT NULL,
    hora_sessao INT NOT NULL,
    minuto_sessao INT NOT NULL,
    preco_sessao DECIMAL(6,2) NOT NULL,
    id_sessao INT PRIMARY KEY AUTO_INCREMENT, 
    FOREIGN KEY(id_filme) REFERENCES filmes(id_filme),
    FOREIGN KEY(cod_sala) REFERENCES sala(cod_sala) 
);

DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente (
    nome_cliente VARCHAR(50) NOT NULL,
    idade_cliente INT NOT NULL,
    sexo_cliente VARCHAR(10) NOT NULL,
    endereco_cliente VARCHAR(300) NOT NULL,
    cpf_cliente VARCHAR(11) PRIMARY KEY
);

CREATE TABLE gerente (
    login_ger VARCHAR(100) PRIMARY KEY,
    senha_ger VARCHAR(100) NOT NULL
);

CREATE TABLE vendedor (
    login_vend VARCHAR(100),
    senha_vend VARCHAR(100) NOT NULL,
    cpf_vend VARCHAR(12),
    turno_vend VARCHAR(12) NOT NULL,
    email_vend VARCHAR(100) NOT NULL,
    PRIMARY KEY (login_vend, cpf_vend)
);

--SELECT * from cliente;
--SELECT * from vendedor;
--SELECT * from gerente;
--SELECT * from sala;
--SELECT * from filmes;
--SELECT * from sessao;

--Área de inserção de valores padrão
--truncate filmes;
insert into filmes (nome_filme, des_filme, gen_filme, ano_filme) values ("Final Destination", "After a teenager has a terrifying vision of him and his friends dying in a plane crash, he prevents the accident only to have Death hunt them down, one by one.", "Horror, Thriller", 2000),
("Final Destination 2", "When Kimberly has a violent premonition of a highway pileup she blocks the freeway, keeping a few others meant to die, safe...Or are they? The survivors mysteriously start dying and it's up to Kimberly to stop it before she's next.", "Horror, Thriller", 2003),
("Final Destination 3", "A student's premonition of a deadly rollercoaster ride saves her life and a lucky few, but not from Death itself, which seeks out those who escaped their fate.", "Horror, Thriller", 2006),
("The Final Destination", "After a young man's premonition of a deadly race-car crash helps saves the lives of his peers, Death sets out to collect those who evaded their end.", "Horror, Thriller", 2009),
("Final Destination 5", "Survivors of a suspension-bridge collapse learn there's no way you can cheat Death.", "Horror, Thriller", 2011),
("The Void", "Shortly after delivering a patient to an understaffed hospital, a police officer experiences strange and violent occurrences seemingly linked to a group of mysterious hooded figures.", "Horror, Mystery, Sci-Fi", 2016),
("The Fast and the Furious: Tokyo Drift", "A teenager becomes a major competitor in the world of drift racing after moving in with his father in Tokyo to avoid a jail sentence in America.", "Action, Crime, Thriller", 2006),
("Baby Driver", "After being coerced into working for a crime boss, a young getaway driver finds himself taking part in a heist doomed to fail.", "Action, Crime, Music", 2017),
("Drive", "A mysterious Hollywood stuntman and mechanic moonlights as a getaway driver and finds himself in trouble when he helps out his neighbor.", "Crime, Drama", 2011),
("Koto no ha no niwa", "A 15-year-old boy and 27-year-old woman find an unlikely friendship one rainy day in the Shinjuku Gyoen National Garden.", "Animation, Drama, Romance", 2013),
("Akira", "A secret military project endangers Neo-Tokyo when it turns a biker gang member into a rampaging psychic psychopath that only two teenagers and a group of psychics can stop.", "Animation, Action, Drama", 1988),
("Pulp Fiction", "The lives of two mob hit men, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", "Crime, Drama", 1994),
("The Hateful Eight", "In the dead of a Wyoming winter, a bounty hunter and his prisoner find shelter in a cabin currently inhabited by a collection of nefarious characters.", "Crime, Drama, Mystery", 2015),
("The Thing", "A research facility in Antarctica comes across an alien force that can become anything it touches with 100% accuracy. The members must now find out who's human and who's not before it's too late.", "Horror, Mystery, Sci-Fi", 1982),
("Taxi Driver", "A mentally unstable Vietnam War veteran works as a night-time taxi driver in New York City where the perceived decadence and sleaze feeds his urge for violent action, while attempting to save a preadolescent prostitute in the process.", "Crime, Drama", 1976),
("Inglourious Basterds", "In Nazi-occupied France during World War II, a plan to assassinate Nazi leaders by a group of Jewish U.S. soldiers coincides with a theatre owner's vengeful plans for the same.", "Adventure, Drama, War,", 2009),
("Django Unchained", "With the help of a German bounty hunter, a freed slave sets out to rescue his wife from a brutal Mississippi plantation owner.", "Drama, Western", 2012),
("Scarface", "In Miami in 1980, a determined Cuban immigrant takes over a drug cartel and succumbs to greed.", "Crime, Drama", 1983),
("That’s My Boy", "While in his teens, Donny fathered a son, Todd, and raised him as a single parent up until Todd's 18th birthday. Now, after not seeing each other for years, Todd's world comes crashing down when Donny resurfaces just before Todd's wedding.", "Comedy", 2012);