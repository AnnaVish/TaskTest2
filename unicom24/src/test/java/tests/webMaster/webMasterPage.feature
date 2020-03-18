# language: ru
Функционал: СмоукТест Вебмастера и ЛК Вебмастера

  @test
  @TestCaseId("9")
  @Severity(Critical)
  Сценарий: Авторизоваться и проверить что кабинет отображается
    Дано пользователь нахоидится на главной странице
    Тогда все элементы главной страницы видны
    Когда пользователь кликает Кабинет вебмастера в футере
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    Тогда отображается личный кабинет Вебмастера
    Когда вебмастер разлогинивается
    Тогда страница авторизации Вебмастера отображается

  @test
  @TestCaseId("11")
  @Severity(Critical)
  Сценарий: Авторизоваться в кабинете со страницы стать партнером нажав на кнопку Зарабатывать сейчас
    Дано пользователь находится на странице Стать партнером
    Тогда отображается страница Стать партнером
    Когда пользователь нажимает Зарабатывать сейчас
    Тогда отображается страница регистрации Вебмастера
    Когда вебмастер кликает на таб Вход
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    И отображается личный кабинет Вебмастера

  @test
  @TestCaseId("29")
  @Severity(Critical)
  Сценарий: Авторизоваться в кабинете и проверить отображение страницы в каждой вкладке
    Дано пользователь нахоидится на странице авторизации Вебмастера
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    И отображается личный кабинет Вебмастера
    Когда вебмастер кликает на вкладку "Настройки"
    Тогда вебмастеру отображается страница "Настройки"
    Когда вебмастер кликает на вкладку "Справка"
    Тогда вебмастеру отображается страница "Справка"
    Когда вебмастер кликает на вкладку "Постбек"
    Тогда вебмастеру отображается страница "Постбек"
    Когда вебмастер кликает на вкладку "Продукты"
    Тогда вебмастеру отображается страница "продукты"
    Когда вебмастер кликает на вкладку "Лендинги"
    Тогда вебмастеру отображается страница "Лендинги"
    Когда вебмастер кликает на вкладку "Офферы"
    Тогда вебмастеру отображается страница "Офферы"
    Когда вебмастер кликает на вкладку "Отчеты"
    Тогда вебмастеру отображается страница "Отчеты"
    Когда вебмастер кликает на вкладку "Мои клиенты"
    Тогда вебмастеру отображается страница "Мои клиенты"
    Когда вебмастер кликает на вкладку "Подбор кредита"
    Тогда вебмастеру отображается страница "Подбор кредита"

  @test
  @TestCaseId("48")
  @Severity(Critical)
  Сценарий: Авторизоваться в кабинете и вывести деньги
    Дано пользователь нахоидится на странице авторизации Вебмастера
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    Когда вебмастер кликает на Вывести деньги
    Тогда отображается модальное окно вывода денег
    И вебмастер увеличивает сумму вывода в модальном окне
    Когда вебмастер кликает далее в модальном окне
    Тогда отображается вторая часть модального окна
    И вебмастер выбирает расчетный способ вывода в модальном окне
    Когда вебмастер кликает вывести деньги в модальном окне
    Тогда отображается оповещение об успешном выводе денег в модальном окне либо было сообщение о 24 часах
    И вебмастер закрывает модальное окно вывода денег либо было сообщение о 24 часах

  @test
  @TestCaseId("49")
  @Severity(Critical)
  Сценарий: Проверка фильтров на тип оффера у Вебмастера
    Дано пользователь нахоидится на странице авторизации Вебмастера
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    Тогда отображается личный кабинет Вебмастера
    Когда вебмастер кликает на вкладку "Офферы"
    Тогда вебмастеру отображается страница "Офферы"
    Когда вебмастер кликает по фильтру тип оффера "API"
    Тогда отображается страница Офферы с активным фильтром по типу оффера "API"
    Когда вебмастер кликает по фильтру тип оффера "Реферальные ссылки"
    Тогда отображается страница Офферы с активным фильтром по типу оффера "Реферальные ссылки"

  @test
  @TestCaseId("51")
  @Severity(Critical)
  Сценарий: Проверка на отображения страницы Подберем займ на любые цели бесплатно
    Дано вебмастер находится на странице Подберем займ на любые цели бесплатно
    Тогда отображется страница Подберем займ на любые цели бесплатно

  @test
  @TestCaseId("52")
  @Severity(Critical)
  Сценарий: Проверка фильтров на тип оффера у Вебмастера
    Дано пользователь нахоидится на странице авторизации Вебмастера
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    Тогда отображается личный кабинет Вебмастера
    Когда вебмастер кликает на вкладку "Офферы"
    Тогда вебмастеру отображается страница "Офферы"
    Когда вебмастер кликает по фильтру тип оффера "API"
    Тогда отображается страница Офферы с активным фильтром по типу оффера "API"
    Когда вебмастер кликает по не универсальному офферу
    Тогда отображается детальная страница оффера у вебмастера
    И вебмастер проверяет вкладки на детальной странице оффера

  @test
  @TestCaseId("53")
  @Severity(Critical)
  Сценарий: Проверка фильтров на тип оффера у Вебмастера
    Дано пользователь нахоидится на странице авторизации Вебмастера
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    Тогда отображается личный кабинет Вебмастера
    Когда вебмастер кликает на вкладку "Офферы"
    Тогда вебмастеру отображается страница "Офферы"
    Когда вебмастер кликает по фильтру тип оффера "Реферальные ссылки"
    Тогда отображается страница Офферы с активным фильтром по типу оффера "Реферальные ссылки"
    Когда вебмастер кликает по не универсальному офферу
    Тогда отображается детальная страница оффера у вебмастера
    И вебмастер проверяет вкладки на детальной странице оффера

  @test
  @TestCaseId("54")
  @Severity(Critical)
  Сценарий: Проверка
    Дано пользователь нахоидится на странице авторизации Вебмастера
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    Тогда отображается личный кабинет Вебмастера
    Когда вебмастер кликает на вкладку "Офферы"
    Тогда вебмастеру отображается страница "Офферы"
    И вебмастер ищет через поиск оффер "Юни24"
    Когда вебмастер кликает по офферу "Юни24"
    Тогда отображается детальная страница оффера у вебмастера
    Когда вебмастер кликает по вкладке "Подключение" на детальной странице оффера
    Тогда отображается вкладка "Подключение" на детальной странице оффера
    И вебмастер проверяет ссылку "Клиентский"
    И вебмастер проверяет ссылку "Серверный"

  @test
  @TestCaseId("57")
  @Severity(Critical)
  Сценарий: Проверка отображения вкладок Сводный Детализированный Единный оффер
    Дано пользователь нахоидится на странице авторизации Вебмастера
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    И отображается личный кабинет Вебмастера
    Когда вебмастер кликает на вкладку "Отчеты"
    Тогда вебмастеру отображается страница "Отчеты"
    Когда вебмастер выбирает "Единный оффер" в отчетах
    Тогда вебмастеру отображается результат выборки "Единный оффер" в отчетах
    Когда вебмастер выбирает "Детализированная" в отчетах
    Тогда вебмастеру отображается результат выборки "Детализированная" в отчетах
    Когда вебмастер выбирает "Общая" в отчетах
    Тогда вебмастеру отображается результат выборки "Общая" в отчетах

  @test
  @TestCaseId("58")
  @Severity(Critical)
  Сценарий: Проверка отображения вкладок Отчетов
    Дано пользователь нахоидится на странице авторизации Вебмастера
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    И отображается личный кабинет Вебмастера
    Когда вебмастер кликает на вкладку "Отчеты"
    Тогда вебмастеру отображается страница "Отчеты"
    Когда вебмастер выбирает вкладку "Динамический лендинг" в отчетах
    Тогда вебмастеру отображается вкладка "Динамический лендинг" в отчетах
    Когда вебмастер выбирает вкладку "Продукты" в отчетах
    Тогда вебмастеру отображается вкладка "Продукты" в отчетах
    Когда вебмастер выбирает вкладку "Лендинги и API" в отчетах
    Тогда вебмастеру отображается вкладка "Лендинги и API" в отчетах
    Когда вебмастер выбирает вкладку "Изменения баланса" в отчетах
    Тогда вебмастеру отображается вкладка "Изменения баланса" в отчетах
    Когда вебмастер выбирает вкладку "Сводный отчет" в отчетах
    Тогда вебмастеру отображается вкладка "Сводный отчет" в отчетах