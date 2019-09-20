# language: ru

Функционал: Проверка что все ссылки в футере работают

  @test
  @TestCaseId("4")
  @Severity(Critical)
  Сценарий: Прокликать все ссылки в футере
    Дано пользователь нахоидится на главной странице
    И все элементы главной страницы видны
    Когда пользователь кликает Стать партнером в футере
    Тогда отображается страница Стать партнером
    Когда пользователь кликает Стать агентом в футере
    Тогда отображается страница Стать агентом