# language: ru
@firstTest

Функционал: Проверка отображения всех элементов на странице список банков


  @test1
  @TestCaseId("6")
  @Severity(Critical)
  Сценарий: Все элементы есть на странице список банков
    Дано пользователь нахоидится на главной странице
    Когда пользователь кликает Посмотреть все банки и МФО
    Тогда отображается страница Все банки
