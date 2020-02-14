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
    Когда вебмастер кликает на вкладку Настройки
    Тогда отображается страница настройки
    Когда вебмастер кликает на вкладку Справка
    Тогда отображается страница Справка
    Когда вебмастер кликает на вкладку Постбек
    Тогда отображается страница Постбек
    Когда вебмастер кликает на вкладку Продукты
    Тогда отображается страница Продукты
    Когда вебмастер кликает на вкладку Лендинги
    Тогда отображается страница Лендинги
    Когда вебмастер кликает на вкладку Офферы
    Тогда отображается страница Офферы
    Когда вебмастер кликает на вкладку Статистика
    Тогда отображается страница Статистика

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
    Тогда отображается оповещение об успешном выводе денег в модальном окне
    И вебмастер закрывает модальное окно вывода денег

  @test
  @TestCaseId("49")
  @Severity(Critical)
  Сценарий: Проверка фильтров на тип оффера у Вебмастера
    Дано пользователь нахоидится на странице авторизации Вебмастера
    Тогда страница авторизации Вебмастера отображается
    И вебМастер авторизовывается
    Тогда отображается личный кабинет Вебмастера
    Когда вебмастер кликает на вкладку Офферы
    Тогда отображается страница Офферы
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
    Когда вебмастер кликает на вкладку Офферы
    Тогда отображается страница Офферы
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
    Когда вебмастер кликает на вкладку Офферы
    Тогда отображается страница Офферы
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
    Когда вебмастер кликает на вкладку Офферы
    Тогда отображается страница Офферы
    И вебмастер ищет через поиск оффер "Юни24"
    Когда вебмастер кликает по офферу "Юни24"
    Тогда отображается детальная страница оффера у вебмастера
    Когда вебмастер кликает по вкладке "Подключение" на детальной странице оффера
    Тогда отображается вкладка "Подключение" на детальной странице оффера
    И вебмастер проверяет ссылку "Клиентский"
    И вебмастер проверяет ссылку "Cерверный"
    #Серверный пишется на сайте через англ C