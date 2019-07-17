# language: ru
@firstTest

Функционал: Проверка главных предложений

  @test
  @TestCaseId("2")
  @Severity(Critical)
  Сценарий: Проверка перехода по главным предложениям
    Дано пользователь нахоидится на главной странице
    Когда пользователь кликает на Кредиты
    Тогда отображается страница Кредиты
    Когда пользователь кликает на Кредитные карты
    Тогда отображается страница Кредитные карты
    Когда пользователь заполняет кликает на Автокредиты
    Тогда отображается страница Автокредиты
    Когда пользователь заполняет кликает на Ипотека
    Тогда отображается страница Ипотека
    Когда пользователь заполняет кликает на Микрозаймы
    Тогда отображается страница Микрозаймы
    Когда пользователь заполняет кликает на Кредитные отчеты
    Тогда отображается страница Кредитные отчеты