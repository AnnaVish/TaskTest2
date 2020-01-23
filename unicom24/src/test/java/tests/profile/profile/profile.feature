# language: ru
Функционал: СомукТест страницы Профиль

  @test
  @TestCaseId("46")
  @Severity(Critical)
  Сценарий: Авторизоваться и проверить все ссылки в профиле отображаются
    Дано пользователь нахоидится на главной странице
    Когда пользователь нажимает на кнопку войти
    И пользователь авторизовывается
    И пользователь заходит в свой профиль
    Тогда отображается главная страница Профиля
    Когда пользователь кликает по вкладке "Профиль" в профиле
    Тогда отображается личные данные на странице Профиль
    Когда пользователь кликает по вкладке "Подписки" в профиле
    Тогда отображается страница Подписки в профиле
    Когда пользователь кликает по вкладке "Главная" в профиле
    Тогда отображается главная страница Профиля
