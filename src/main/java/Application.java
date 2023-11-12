public class Application {
    public static int doCalc(String[][] arr) {
        int sum = 0;
        if (arr.length != 4 || arr[0].length != 4) {
            throw new ArraySizeException("Масив не є 4*4");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Невірний формат даних в ячейці:" + "[" + i + "]" + "[" + j + "]");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] mas = {
                {"4", "5", "6", "3"},
                {"8", "9", "3", "4"},
                {"22", "3 3", "5", "66"},
                {"65", "34", "46", "22"}
        };
        try {
            int result = doCalc(mas);
            System.out.println("Результат: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
//1. Створити Клас ArrayValueCalculator
//2. Створити метод doCalc. На вхід до методу подається двомірний рядковий масив
// розміром 4х4.
//3. При передачі масиву іншого розміру в метод doCalc необхідно
// викинути виняток ArraySizeException.
//
//4. Метод doCalc повинен пройтися за всіма елементами масиву
// і перетворити в int (використовувати Integer#parseInt) і підсумувати.
// Після загального підсумовування метод повертає фінальний результат
// у вигляді int.
//
//5.Якщо в якомусь елементі масиву перетворення не вдалося
// (наприклад, в комірці лежить символ або текст замість числа),
// тоді викинути виняток ArrayDataException, з деталізацією в якому саме
// комірці лежать невірні дані.
//
//6. У методі main() викликати отриманий метод, обробити можливі винятки
// ArraySizeException та ArrayDataException, та вивести результат розрахунку.
//
//7. * Необхідно дотримуватись усіх правил збереження контексту викинутого
// виключення.
//
//8. * При вилові винятків у процесі перетворення, взяти до уваги винятки,
// що викидаються іншими (сторонніми) методами, що використовуються.
