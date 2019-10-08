# language: ru
Функционал: Проверка авторизации Рекламодателя и ЛК Рекламодателя

  @test
  @TestCaseId("12")
  @Severity(Critical)
  Сценарий: Авторизоваться через футэр и проверить что кабинет отображается
    Дано пользователь нахоидится на главной странице
    Тогда все элементы главной страницы видны
    Когда пользователь кликает Личный кабинет Банков и Рекламодателей в футере
    Тогда отображается страница авторизации Личный кабинет Банков и Рекламодателей
    И рекламодатель авторизовывается
    И отображается личный кабинет Банков и Рекламодателей

  @test
  @TestCaseId("13")
  @Severity(Critical)
  Сценарий: Авторизоваться в кабинете со страницы стать партнером нажав на кнопку Получать заявки
    Дано пользователь находится на странице Стать партнером
    Тогда отображается страница Стать партнером
    Когда пользователь нажимает Получать заявки
    Тогда отображается страница авторизации Личный кабинет Банков и Рекламодателей
    И рекламодатель авторизовывается
    И отображается личный кабинет Банков и Рекламодателей