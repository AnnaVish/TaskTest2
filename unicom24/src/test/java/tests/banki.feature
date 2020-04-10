# language: ru
@banki

Функционал: Проверка страницы Список банков


  @test
  @TestCaseId("5")
  @Severity(Critical)
  Сценарий: Ввели название банка - увидели правильный результат
    Дано пользователь нахоидится на странице Список банков
    И отображается страница Все банки
    Когда пользователь вводит "Тинькофф" в поле ввода
    И пользователь наживает на кнопку поиск
    Тогда на странице появляется ссылка на "Тинькофф"

  @test
  @TestCaseId(33")
  @Severity(Critical)
  Сценарий: Проверка отображения отзывов на банк
    Дано пользователь нахоидится на странице Список банков
    И отображается страница Все банки
    Когда пользователь кликает на название банка на странице все банки
    Тогда отображается страница банка с предложениями
    Когда пользователь кликает на отзывы
    Тогда отображаются отзывы

  @test4
  @TestCaseId("5")
  @Severity(Critical)
  Сценарий: Проверка фильтров на странице Багки России
    Дано пользователь нахоидится на странице Список банков
    И отображается страница Все банки
    Когда пользователь выбирает фильтр "Кредиты" на странице Все банки
    Тогда пользователь видит результат по фильтру "Кредиты" и проверяет список нажав Показать еще
    Когда пользователь выбирает фильтр "Кредитные карты" на странице Все банки
    Тогда пользователь видит результат по фильтру "Кредитные карты" и проверяет список нажав Показать еще
    Когда пользователь выбирает фильтр "Ипотека" на странице Все банки
    Тогда пользователь видит результат по фильтру "Ипотека" и проверяет список нажав Показать еще
#    Когда пользователь выбирает фильтр "Микрозаймы" на странице Все банки
#    Тогда пользователь видит результат по фильтру "Кредиты" и проверяет список нажав Показать еще
    Когда пользователь выбирает фильтр "Автокредиты" на странице Все банки
    Тогда пользователь видит результат по фильтру "Автокредиты" и проверяет список нажав Показать еще