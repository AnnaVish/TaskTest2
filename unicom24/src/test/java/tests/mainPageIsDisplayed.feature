# language: ru
@firstTest
@mainPageIsDisplayed

Функционал: Проверка отображения всех элементов на главной


  @test
  @TestCaseId("1")
  @Severity(Critical)
  Сценарий: Все элементы есть на главной странице
    Дано пользователь нахоидится на главной странице
    Тогда все элементы главной страницы видны
