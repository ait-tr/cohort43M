Зарегистрировались в https://drawsql.app

## Диаграммf с занятия:

- https://drawsql.app/teams/ait-16/diagrams/lesson-2

```sql
 CREATE TABLE
  student (id serial PRIMARY KEY, name varchar(80));
CREATE TABLE
  course (id serial PRIMARY KEY, title varchar(80));
CREATE TABLE
  student_course (
    student_id int,
    course_id int,
    FOREIGN KEY (student_id) REFERENCES student (id),
    FOREIGN KEY (course_id) REFERENCES course (id)
  );
```

```sql
CREATE TABLE
  category (id serial PRIMARY KEY, title varchar(80));

CREATE TABLE
  product (
    id serial PRIMARY KEY,
    title varchar(80),
    category_id int,
    FOREIGN KEY (category_id) REFERENCES category (id)
  );
```

```sql
 INSERT INTO
  student (name)
VALUES
  ('John'),
  ('Anna'),
  ('Max');
INSERT INTO
  course (title)
VALUES
  ('Backend'),
  ('Frontend'),
  ('DB'),
  ('QA');
INSERT INTO
  student_course (student_id, course_id)
VALUES
  (1, 1),
  (1, 4),
  (2, 3),
  (2, 4);

SELECT
  course.title,
  student.name
FROM
  student
  JOIN student_course ON student.id = student_course.student_id
  JOIN course ON student_course.course_id = course.id
WHERE
  student.id = 1;
```

```sql
SELECT
  product.title,
  category.title
FROM
  product
  JOIN category ON product.category_id = category.id
```

```sql


```
