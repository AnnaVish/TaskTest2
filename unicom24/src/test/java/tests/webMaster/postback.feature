# language: ru
@postback

Функционал: Проверка постбеков

  @test
  @TestCaseId("40")
  @Severity(Critical)
  Сценарий: Сделать постбек get
    Дано пользователь нахоидится на странице авторизации Вебмастера
    Дано страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    И отображается личный кабинет Вебмастера
    Когда вебмастер кликает на вкладку "Постбек"
    Тогда вебмастеру отображается страница "Постбэк"
    И вебмастер подготавливает параметры для постбека
    И на странице постбека отображаются данные из параметров
    И вебмастер сохраняет новый постбэк
