# language: ru

Функционал: Проверка что все ссылки в футере работают

  @test
  @TestCaseId("4")
  @Severity(Critical)
  Сценарий: Прокликать все ссылки в футере
    Дано пользователь нахоидится на главной странице
    Когда пользователь кликает Стать партнером в футере
    Тогда отображается страница Стать партнером
    Когда пользователь кликает Стать агентом в футере
    Тогда отображается страница Стать агентом
    Когда пользователь кликает Кабинет вебмастера в футере
    Тогда страница авторизации Вебмастера отображается
    И пользователь закрывает вкладку
    Когда пользователь кликает Личный кабинет Банков и Рекламодателей в футере
    Тогда отображается страница авторизации Личный кабинет Банков и Рекламодателей
    И пользователь закрывает вкладку
    Когда пользователь кликает Личный кабинет Брокера и Агента в футере
    Тогда отображается страница поиска офферов со входом
    И пользователь закрывает вкладку
    Когда пользователь кликает О компании в футере
    Тогда отображается страница О компании