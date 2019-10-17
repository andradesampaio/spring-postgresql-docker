DROP TABLE IF EXISTS books CASCADE;
CREATE TABLE books (
  id         SERIAL,
  title       TEXT,
  author      TEXT,

  PRIMARY KEY (id)
);

INSERT INTO public.books (
  id, title, author)
VALUES (1, 'Madol Duwa', 'Martin Wickramasinghe'),
  (2, 'Gamperaliya', 'Martin Wickramasinghe'),
  (3, 'Java', 'Otavio Santana'),
  (4, 'MongoDB', 'Rogerio Silva'),
  (5, 'SQLServer', 'Olavo Souza');

CREATE SEQUENCE hibernate_sequence START 1;
SELECT setval('hibernate_sequence', (SELECT max(id) FROM public.books));