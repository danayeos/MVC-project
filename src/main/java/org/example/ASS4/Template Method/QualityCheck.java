// Абстрактный класс, который определяет шаблонный метод проверки качества продукта
public abstract class QualityCheck {

    // Шаблонный метод, определяющий последовательность шагов проверки
    public final void performQualityCheck() {
        checkAppearance(); // Шаг 1: Проверка внешнего вида (одинаково для всех продуктов)
        checkSpecificCharacteristics(); // Шаг 2: Проверка специфических характеристик (разная для разных продуктов)
        finalReport(); // Шаг 3: Заключительный отчёт (одинаково для всех продуктов)
    }

    // Метод для проверки внешнего вида, одинаковый для всех типов продуктов
    private void checkAppearance() {
        System.out.println("Проверка внешнего вида: внешний вид соответствует стандартам.");
    }

    // Абстрактный метод для проверки специфических характеристик (разный для каждого продукта)
    protected abstract void checkSpecificCharacteristics();

    // Метод для вывода заключительного отчёта, одинаковый для всех типов продуктов
    private void finalReport() {
        System.out.println("Заключительный отчёт: проверка завершена, продукт прошёл контроль качества.");
    }
}