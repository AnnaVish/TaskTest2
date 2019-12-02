# language: ru
Функционал: СмоукТест Брокера и ЛК Брокера

  @test4
  @TestCaseId("10")
  @Severity(Critical)
  Сценарий: Авторизоваться и проверить что кабинет отображается. Разлогиниться и проверить, что отображается страница авторизации
    Дано пользователь нахоидится на главной странице
    Когда пользователь кликает Личный кабинет Брокера и Агента в футере
    Тогда отображается страница авторизации Личный кабинет Брокера и Агента
    И брокер авторизовывается
    И отображается Личный кабинет Брокера
    Когда брокер разлогинивается
    Тогда отображается страница авторизации Личный кабинет Брокера и Агента

  @test
  @TestCaseId("30")
  @Severity(Critical)
  Сценарий: Авторизоваться и проверить что кабинет отображается
    Дано пользователь нахоидится на странице авторизации Брокера
    Тогда отображается страница авторизации Личный кабинет Брокера и Агента
    И брокер авторизовывается
    Когда брокер кликает на каталог офферов
    Тогда отображается страница каталог офферов
    Когда брокер кликает на Мои клиенты
    Тогда отображается страница Мои клиенты в кабинете брокера
    Когда брокер наводит мышь на Все услуги
    Тогда отображается меню Все услуги
    Когда брокер наводит мышь на Финансовый рейтинг клиента
    Тогда отображается меню Финансовый рейтинг клиента
    Когда брокер наводит мышь на Авто
    Тогда отображается меню Авто
    Когда брокер наводит мышь на Скоринг
    Тогда отображается меню Скоринг


  @test
  @TestCaseId("34")
  @Severity(Critical)
  Сценарий: Проверить отображение страницы Рейтинг финансового здоровья
    Дано пользователь нахоидится на странице авторизации Брокера
    Тогда отображается страница авторизации Личный кабинет Брокера и Агента
    И брокер авторизовывается
    Когда брокер наводит мышь на Все услуги
    Тогда отображается меню Все услуги
    Когда брокер кликает на Рейтинг финансового здоровья
    Тогда отображается страница Рейтинг финансового здоровья в кабинете брокера

  @test
  @TestCaseId("34")
  @Severity(Critical)
  Сценарий: Проверить отображение меню пополнить счет
    Дано пользователь нахоидится на странице авторизации Брокера
    Тогда отображается страница авторизации Личный кабинет Брокера и Агента
    И брокер авторизовывается
    Когда брокер нажимает на кнопку Пополнить счет
    Тогда отображается панель Пополнить счет
    Когда брокер нажимает на кнопку Пополнить счет
    Тогда панель Пополнить счет не отображается