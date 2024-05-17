### Lesson 26


`LinkedList` в Java — это класс из пакета `java.util`, который реализует интерфейсы `List`, `Deque` и `Queue`. Он представляет собой двусвязный список, где каждый элемент списка содержит ссылки как на предыдущий, так и на следующий элемент в списке. Это позволяет элементам быть эффективно вставленными и удаленными из любого места списка. В отличие от `ArrayList`, `LinkedList` обеспечивает более высокую производительность при вставке и удалении элементов, особенно если операции происходят в середине списка, но имеет меньшую производительность при произвольном доступе к элементам.

### Основные характеристики

- **Двусвязный список**: Каждый элемент списка содержит ссылки на предыдущий и следующий элементы, что облегчает добавление и удаление элементов.
- **Динамический размер**: Размер `LinkedList` может динамически изменяться с добавлением или удалением элементов, в отличие от статических массивов.
- **Реализует `List`, `Deque`, `Queue`**: Может использоваться как обычный список, двусторонняя очередь или очередь FIFO.

### Основные методы

`LinkedList` предоставляет все методы интерфейса `List`, а также специфические методы для работы с первым и последним элементами списка:

- `add(E e)`, `add(int index, E element)`: добавляет элемент в список;
- `remove(Object o)`, `remove(int index)`: удаляет элемент из списка;
- `get(int index)`: возвращает элемент по указанному индексу;
- `set(int index, E element)`: заменяет элемент на указанной позиции;
- `addFirst(E e)`, `addLast(E e)`: добавляет элементы в начало или конец списка;
- `removeFirst()`, `removeLast()`: удаляет первый или последний элемент списка;
- `getFirst()`, `getLast()`: возвращает первый или последний элемент списка;
- `size()`: возвращает количество элементов в списке.

### Преимущества и недостатки

**Преимущества**:
- Гибкость при вставке и удалении элементов;
- Поддержка работы как со стеком, так и с очередью.

**Недостатки**:
- Поиск и доступ к элементам происходят медленнее, чем в `ArrayList`, из-за необходимости прохода по ссылкам;
- Больше расход памяти на хранение ссылок на предыдущий и следующий элементы.

### Использование

`LinkedList` идеально подходит для ситуаций, когда необходимо часто вставлять или удалять элементы, особенно если размер списка заранее неизвестен или его изменения происходят динамически. Однако, если требуется частый произвольный доступ к элементам, лучше использовать `ArrayList` или другие структуры данных, оптимизированные для таких операций.