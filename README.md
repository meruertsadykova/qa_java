# qa_java QA Java Project
## Исследование семейства кошачьих
Этот проект разработан для зоологов, изучающих поведение хищных кошачьих. Реализована и протестирована часть программной модели, в том числе классы Cat, Lion, Feline, а также дополнительный класс AlexLion.


## Стек технологий
- Java 11
- JUnit 5
- Mockito
- Jacoco
- Maven

## Реализованные задачи
- Подключён Maven и зависимости (JUnit, Mockito, Jacoco)
- Класс Lion не зависит напрямую от Feline (используется инъекция зависимостей)
- Созданы моки Feline в тестах с использованием Mockito
- Покрытие тестами классов:
1. Cat
2. Feline
3. Lion
4. AlexLion (дополнительное задание)
- Использованы параметризованные тесты
- Покрытие по Jacoco — 100%
- Добавлен отчёт Jacoco в репозиторий (target/site/jacoco/index.html)

## Структура проекта
src/
├── main/
│   └── java/com/example/
│       ├── Animal.java
│       ├── Predator.java
│       ├── Feline.java
│       ├── Cat.java
│       ├── Lion.java
│       └── AlexLion.java
└── test/
└── java/com/example/
├── FelineTest.java
├── CatTest.java
├── LionTest.java
└── AlexLionTest.java

## Как сгенерировать отчёт Jacoco
```
mvn clean test jacoco:report
```
Открой файл:
target/site/jacoco/index.html

## Как запустить тесты
```
mvn test
```

## Дополнительное задание
Создан класс AlexLion (Алекс из «Мадагаскара») — потомок Lion, со своими методами:

- getFriends() → ["Марти", "Глория", "Мелман"]
- getPlaceOfLiving() → "Нью-Йоркский зоопарк"
- getKittens() переопределён — возвращает 0
Класс покрыт отдельными тестами.
