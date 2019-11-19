# language: ru
@firstTest

Функционал: Проверка страницы Список банков


  @test4
  @TestCaseId("5")
  @Severity(Critical)
  Сценарий: Ввели название банка - увидели правильный результат
    Дано пользователь нахоидится на странице Список банков
    И отображается страница Все банки
    Когда пользователь вводит "Тинькофф" в поле ввода
    И пользователь наживает на кнопку поиск
    Тогда на странице появляется ссылка на "Тинькофф"

  @test4
  @TestCaseId(33")
  @Severity(Critical)
  Сценарий: Проверка отображения отзывов на банк
    Дано пользователь нахоидится на странице Список банков
    И отображается страница Все банки
    Когда пользователь кликает на название банка на странице все банки
    Тогда отображается страница банка с предложениями
    Когда пользователь кликает на отзывы
    Тогда отображаются отзывы