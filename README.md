## Функционал
- В CicdApplication.java реализованы методы:
- `public Integer[] readFromFile(String fileName)` - метод для чтения данных из файла
- `public int _min(Integer[] arr)` - метод для нахождения минимального элемента в массиве
- `public int _max(Integer[] arr)` - метод для нахождения максимального элемента в массиве
- `public int _sum(Integer[] arr)` - метод для нахождения суммы элементов массива
- `public int _mult(Integer[] arr)` - метод для нахождения произведения элементов массива

## Тесты
- В классе CicdApplicationTest.java реализованы тесты для методов:
- `public void readFromFileTest()` - тест для метода readFromFile
- `public void _minTest()` - тест для метода _min
- `public void _maxTest()` - тест для метода _max
- `public void _sumTest()` - тест для метода _sum
- `public void _multTest()` - тест для метода _mult
- `public void _minSpeedTest()` - тест для метода _min, проверяющий скорость выполнения
- `public void _maxSpeedTest()` - тест для метода _max, проверяющий скорость выполнения
- `public void _sumSpeedTest()` - тест для метода _sum, проверяющий скорость выполнения
- `public void _multSpeedTest()` - тест для метода _mult, проверяющий скорость выполнения
- `public void readFromFileSpeedTest()` - тест для метода readFromFile, проверяющий скорость выполнения

## Запуск тестов
Для запуска тестов необходимо выполнить команду:

```bash
make test
```
