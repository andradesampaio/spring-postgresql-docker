DROP TABLE IF EXISTS book CASCADE;
CREATE TABLE book (
  id         SERIAL,
  title       TEXT,
  author      TEXT,
  amount      INT,
  price       NUMERIC(5,2),

  PRIMARY KEY (id)
);

INSERT INTO public.book (
  id, title, author, amount, price)
VALUES (1, 'PHP', 'Candalo Souza', 4, 50.00),
  (2, 'C#', 'Martin Silva',10, 100.00),
  (3, 'Java', 'Otavio Santana',50, 15.00),
  (4, 'MongoDB', 'Rogerio Silva',12, 88.00),
  (5, 'SQLServer', 'Olavo Souza',21, 33.80);

CREATE SEQUENCE hibernate_sequence START 1;
SELECT setval('hibernate_sequence', (SELECT max(id) FROM public.book));