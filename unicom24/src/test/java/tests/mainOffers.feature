# language: ru
@firstTest

Функционал: Проверка главных предложений

  @test
  @TestCaseId("2")
  @Severity(Critical)
  Сценарий: Проверка отображения страницы Сервисы
    Дано пользователь нахоидится на главной странице
    Когда пользователь кликает на Кредитные отчеты
    Тогда отображается страница Сервисы

  @test
  @TestCaseId("15")
  @Severity(Critical)
  Сценарий: Блок кредиты. Отображение подробной страницы банка
    Дано пользователь нахоидится на главной странице
    Когда пользователь кликает на Кредиты
    Тогда отображается страница Кредиты
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница банка

  @test
  @TestCaseId("16")
  @Severity(Critical)
  Сценарий: Блок кредитные карты. Отображение подробной страницы кредитные карты
    Дано пользователь нахоидится на главной странице
    Когда пользователь кликает на Кредитные карты
    Тогда отображается страница Кредитные карты
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница Кредитной карты

  @test
  @TestCaseId("17")
  @Severity(Critical)
  Сценарий: Блок автокредиты. Отображение подробной страницы автокредита
    Дано пользователь нахоидится на главной странице
    Когда пользователь кликает на Автокредиты
    Тогда отображается страница Автокредиты
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница Автокредита

  @test
  @TestCaseId("18")
  @Severity(Critical)
  Сценарий: Блок Ипотека. Отображение подробной страницы ипотеки
    Дано пользователь нахоидится на главной странице
    Когда пользователь кликает на Ипотека
    Тогда отображается страница Ипотека
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница Ипотеки

  @test4
  @TestCaseId("19")
  @Severity(Critical)
  Сценарий: Блок Микрозаймы. Отображение подробной страницы микрозайма
    Дано пользователь нахоидится на главной странице
    Когда пользователь кликает на Микрозаймы
    Тогда отображается страница Микрозаймы
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница Микрозайма

  @test
  @TestCaseId("20")
  @Severity(Critical)
  Сценарий: Блок Рефинансирование. Отображение подробной страницы банка рефинансирования
    Дано пользователь нахоидится на главной странице
    Когда пользователь нажимает Рефинансирование в Хэдэре
    Тогда отображается страница Рефинансирование
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница рефинансирования

  @test
  @TestCaseId("22")
  @Severity(Critical)
  Сценарий: Прокликать все предложения на страницах вертикалей и проверить что переход работает
    Дано пользователь нахоидится на странице Кредиты
    Тогда отображается страница Кредиты
    И пользователь выбирает локацию "Москва"
    И пользователь проверяет что переходы работают

  @test
  @TestCaseId("23")
  @Severity(Critical)
  Сценарий: Прокликать все предложения на страницах вертикалей и проверить что переход работает
    Когда пользователь находится на странице Кредитные карты
    Тогда отображается страница Кредитные карты
    И пользователь выбирает локацию "Москва"
    И пользователь проверяет что переходы работают

  @test
  @TestCaseId("24")
  @Severity(Critical)
  Сценарий: Прокликать все предложения на страницах вертикалей и проверить что переход работает
    Когда пользователь находится на странице Автокредиты
    Тогда отображается страница Автокредиты
    И пользователь выбирает локацию "Москва"
    И пользователь проверяет что переходы работают

  @test
  @TestCaseId("25")
  @Severity(Critical)
  Сценарий: Прокликать все предложения на страницах вертикалей и проверить что переход работает
    Когда пользователь находится на странице Ипотека
    Тогда отображается страница Ипотека
    И пользователь выбирает локацию "Москва"
    И пользователь проверяет что переходы работают

  @test
  @TestCaseId("26")
  @Severity(Critical)
  Сценарий: Прокликать все предложения на страницах вертикалей и проверить что переход работает
    Когда пользователь находится на странице Микрозаймы
    Тогда отображается страница Микрозаймы
    И пользователь выбирает локацию "Москва"
    И пользователь проверяет что переходы работают

  @test
  @TestCaseId("27")
  @Severity(Critical)
  Сценарий: Прокликать все предложения на страницах вертикалей и проверить что переход работает
    Когда пользователь находится на странице Рефинансирование
    Тогда отображается страница Рефинансирование
    И пользователь выбирает локацию "Москва"
    И пользователь проверяет что переходы работают

  @test_Not_Worked
  @TestCaseId("33")
  @Severity(Critical)
  Сценарий: Авторизоваться в кабинете брокера и убедиться что переходы есть
    Дано пользователь нахоидится на странице авторизации Брокера
    Тогда отображается страница авторизации Личный кабинет Брокера и Агента
    И брокер авторизовывается
    И отображается Личный кабинет Брокера
    Когда брокер кликает на "Каталог офферов" в хэдэре
    Тогда отображается страница каталог офферов
    И отображаются офферы