# language: ru
@catalog

Функционал: Регистрация в кабинете вебмастера

  @test1
  @TestCaseId("39")
  @Severity(Critical)
  Сценарий: Проверка заполненности всех необходимых полей
    Дано пользователь нахоидится на странице авторизации
    Когда пользователь заполняет все поля, занятый email и отпарвляет форму
    Тогда видна ошибка что адрес занят