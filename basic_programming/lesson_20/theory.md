### Lesson 20

### Наследование в Объектно-Ориентированном Программировании

#### Определение Наследования
Наследование — это ключевой принцип объектно-ориентированного программирования (ООП),
который позволяет одному классу наследовать (или расширять) свойства и методы другого класса.
Это обеспечивает иерархическую классификацию и помогает избегать дублирования кода.

#### Работа Наследования
В наследовании создаётся два типа классов:
1. **Базовый Класс (Родительский Класс)**: Класс, свойства и методы которого наследуются.
2. **Производный Класс (Дочерний Класс)**: Класс, который наследует свойства и методы базового класса.

#### Пример в Java
Допустим, у нас есть базовый класс `Транспортное Средство` и мы хотим создать производный класс `Автомобиль`.

```java
// Базовый класс
public class ТранспортноеСредство {
    protected String бренд;

    public void двигаться() {
        System.out.println("Транспортное средство двигается");
    }
}

// Производный класс
public class Автомобиль extends ТранспортноеСредство {
    private int количествоДверей;

    public void звукГудка() {
        System.out.println("Бип-бип!");
    }
}
```

В этом примере:
- `Автомобиль` наследует свойства и методы класса `ТранспортноеСредство`.
- `Автомобиль` может использовать метод `двигаться`, определённый в `ТранспортноеСредство`.
- `Автомобиль` добавляет свои уникальные свойства и методы, например, `количествоДверей` и `звукГудка`.

#### Типы Наследования
1. **Одиночное Наследование**: Когда класс наследует только один родительский класс.
2. **Множественное Наследование**: Когда класс наследует более одного родительского класса.
   В Java прямое множественное наследование не поддерживается.

#### Преимущества Наследования
1. **Повторное Использование Кода**: Позволяет использовать код родительского класса, уменьшая дублирование.
2. **Расширяемость**: Упрощает добавление новых функций и модификацию существующих, повышая гибкость кода.
3. **Иерархическая Структура**: Облегчает создание и понимание иерархических классов и отношений между ними.

#### Ограничения и Внимание
- **Переопределение Методов**: Возможность переопределения методов родительского класса в дочернем классе может быть как полезной, так и источником ошибок.
- **Контроль Доступа**: Важно правильно управлять доступом к полям и методам, чтобы предотвратить нежелательный доступ или изменения.
- **Сложность**: Неправильное использование наследования может привести к чрезмерной сложности и затруднить поддержку кода.

#### Заключение
Наследование — мощный инструмент в ООП, который, при правильном использовании, значительно повышает эффективность
и качество программного кода, делая его более читаемым, расширяемым и легким в обслуживании.


### Абстракция в Java

#### Определение Абстракции
Абстракция в объектно-ориентированном программировании (ООП) и в частности в Java,
это процесс выделения общих характеристик объектов и их обобщение.
Абстракция помогает скрыть сложные детали и показывать только необходимые характеристики.

#### Реализация Абстракции в Java
Абстракция в Java может быть реализована двумя способами:
1. **Абстрактные Классы**: Классы, которые не могут быть инстанциированы (нельзя создать объект этого класса напрямую),
2. и которые могут содержать абстрактные методы (без реализации).
2. **Интерфейсы**: Позволяют объявить методы, которые должны быть реализованы в дочерних классах.

#### Пример Абстрактного Класса
Рассмотрим пример с абстрактным классом `Транспортное Средство` и его конкретными реализациями.

```java
// Абстрактный класс
public abstract class ТранспортноеСредство {
    protected String бренд;

    // Абстрактный метод
    public abstract void двигаться();

    // Обычный метод
    public void остановиться() {
        System.out.println("Транспортное средство остановилось");
    }
}

// Конкретный класс
public class Автомобиль extends ТранспортноеСредство {
    @Override
    public void двигаться() {
        System.out.println("Автомобиль движется");
    }
}
```

В этом примере:
- `ТранспортноеСредство` является абстрактным классом, который определяет абстрактный метод `двигаться()` без реализации.
- `Автомобиль` является конкретным классом, который наследует от `ТранспортноеСредство` и предоставляет реализацию
- для абстрактного метода `двигаться()`.

#### Преимущества Абстракции
1. **Упрощение Понимания**: Абстракция позволяет сосредоточиться на важных характеристиках объекта, игнорируя менее важные детали.
2. **Модульность**: Абстракция способствует созданию модульного кода, так как изменения в одной части системы меньше влияют на другие.
3. **Гибкость и Масштабируемость**: Программы становятся более гибкими и легко расширяются благодаря использованию обобщенных интерфейсов и абстрактных классов.

#### Заключение
Абстракция в Java — это мощный инструмент, который помогает разработчикам сосредоточиться на важных аспектах системы,
упрощая проектирование и повышая гибкость программ. Она позволяет создавать более чистые, понятные и легко расширяемые программы.

