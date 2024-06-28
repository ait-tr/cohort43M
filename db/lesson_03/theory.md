# Операторы

#### `=` равенство
#### `<` меньше
#### `>` больше
#### `<=` меньше или равно
#### `<>` не равно
#### `!=` не равно

#### `LIKE` проверяет соответствует ли значение определенному патерну(чувстивтельно к регистру)

#### `ILIKE` проверяет соответствует ли значение определенному патерну(без учета регистра)

#### `AND` логическое `и`

#### `OR` логическое `или`

#### `IN` проверяет находится ли значение внутури диапазона значений (равнозначно нескольким условиям)

#### `BETWEEN` проверяет находится ли значение внтури диапазона значений

#### `IS NULL` проверяет является ли значение NULL-ом

#### `NOT` в комбинации с другими операторам позволяет формулировать отрицательные условия `NOT LIKE`, `NOT IN`, `NOT BETWEEN`

## Aggregation - получение вычисленных данных (итоги, статистика, аналитика)

### Базовые операторы агрегации
- COUNT() расчет ко-ва строк
- AVG() расчет сред/ариф. знач.
- MAX() расчет макс. значения
- MIN() расчет мин. значения
- SUM() расчет суммы

## GROUP BY
Выводит данные сгруппированные по опредленному значению, например по стране.
```
  SELECT
  country,
  MIN(age) AS min_age
FROM
  farmer
GROUP BY
  country;
```
## HAVING
Если требуется задать уточнение после group by:
```sql
  SELECT
  country,
  COUNT(id)
FROM
  farmer
GROUP BY
  country
HAVING COUNT(id) >= 2;
```



## PRIMARY KEY

Ограничение первичного ключа указывает, что столбец или группа столбцов могут использоваться в качестве уникального идентификатора строк в таблице. Для этого необходимо, чтобы значения были уникальными и не были нулевыми. Итак, следующие два определения таблицы принимают одни и те же данные:

```sql
CREATE TABLE products (
    product_no integer PRIMARY KEY,
    name text,
    price numeric
);
```

Если несколько столбцов являются первичными ключами - синтаксис будет такой же как в случае с unique:

```sql
CREATE TABLE example (
    a integer,
    b integer,
    c integer,
    PRIMARY KEY (a, c)
);
```

## FOREIGN KEY

Ограничение внешнего ключа указывает, что значения в столбце (или группе столбцов) должны соответствовать значениям, появляющимся в некоторой строке другой таблицы. Мы говорим, что это поддерживает ссылочную целостность между двумя связанными таблицами.

Допустим, у вас есть таблица продуктов, которую мы уже использовали несколько раз:

```sql
CREATE TABLE products (
    product_no integer PRIMARY KEY,
    name text,
    price numeric
);
```

Предположим также, что у вас есть таблица, в которой хранятся заказы на эти продукты. Мы хотим, чтобы таблица заказов содержала только заказы на действительно существующие товары. Поэтому мы определяем ограничение внешнего ключа в таблице заказов, которое ссылается на таблицу продуктов:

```sql
CREATE TABLE orders (
    order_id integer PRIMARY KEY,
    product_no integer REFERENCES products (product_no),
    quantity integer
);
```

Теперь невозможно создавать заказы с non-NULL product_no, которыго бы не было ранее в таблице продуктов.

Мы говорим, что в этой ситуации таблица заказов является ссылаюшейся таблицей, а таблица продуктов — та на которую ссылаются. Аналогичным образом существуют ссылающиеся и ссылочные столбцы.

## ON DELETE CASCADE

ON DELETE CASCADE — это опция, которую можно использовать при определении ограничения внешнего ключа. Если указано ON DELETE CASCADE, Postgres автоматически удаляет любую строку в дочерней таблице, которая ссылается на удаленную строку из родительской таблицы.

```sql
CREATE TABLE products (
    product_no integer PRIMARY KEY,
    name text,
    price numeric
);

CREATE TABLE orders (
    order_id integer PRIMARY KEY,
    shipping_address text,
    ...
);

CREATE TABLE order_items (
    product_no integer REFERENCES products ON DELETE RESTRICT,
    order_id integer REFERENCES orders ON DELETE CASCADE,
    quantity integer,
    PRIMARY KEY (product_no, order_id)
);
```


## Псевдонимы (alias) в SQL / Оператор AS

```sql
SELECT
        ProductName,
    Price AS Price_eur,
    Price * 1.1 AS Price_usd
FROM Products
```

```sql
SELECT *,
    Price * 1.1 AS Price_usd
FROM Products
```

```sql
SELECT *,
    Price * .95 AS Price_down
FROM Products
```
