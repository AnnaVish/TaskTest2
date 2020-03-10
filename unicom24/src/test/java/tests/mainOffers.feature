# language: ru
@firstTest

Функционал: Проверка главных предложений

  @test
  @TestCaseId("15")
  @Severity(Critical)
  Сценарий: Блок кредиты. Отображение подробной страницы банка
    Дано пользователь нахоидится на главной странице
    И все элементы главной страницы видны
    Когда пользователь кликает на Кредиты
    Тогда отображается страница Кредиты
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница банка
    Когда пользователь кликает на подробной странице на вкладку "Условия"
    Тогда отображается на подробной странице вкладка "Условия"
    Когда пользователь кликает на подробной странице на вкладку "Документы"
    Тогда отображается на подробной странице вкладка "Документы"
    Когда пользователь кликает на подробной странице на вкладку "Отзывы"
    Тогда отображается на подробной странице вкладка "Отзывы"
    Когда пользователь кликает на подробной странице на вкладку "Об организации"
    Тогда отображается на подробной странице вкладка "Об организации"
    Когда пользователь кликает на подробной странице на вкладку "Предложения"
    Тогда отображается на подробной странице вкладка "Предложения"

  @test
  @TestCaseId("16")
  @Severity(Critical)
  Сценарий: Блок кредитные карты. Отображение подробной страницы кредитные карты
    Дано пользователь нахоидится на главной странице
    И все элементы главной страницы видны
    Когда пользователь кликает на Кредитные карты
    Тогда отображается страница Кредитные карты
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница Кредитной карты
    Когда пользователь кликает на подробной странице на вкладку "Условия"
    Тогда отображается на подробной странице вкладка "Условия"
    Когда пользователь кликает на подробной странице на вкладку "Документы"
    Тогда отображается на подробной странице вкладка "Документы"
    Когда пользователь кликает на подробной странице на вкладку "Отзывы"
    Тогда отображается на подробной странице вкладка "Отзывы"
    Когда пользователь кликает на подробной странице на вкладку "Об организации"
    Тогда отображается на подробной странице вкладка "Об организации"
    Когда пользователь кликает на подробной странице на вкладку "Предложения"
    Тогда отображается на подробной странице вкладка "Предложения"

  @test
  @TestCaseId("17")
  @Severity(Critical)
  Сценарий: Блок автокредиты. Отображение подробной страницы автокредита
    Дано пользователь нахоидится на главной странице
    И все элементы главной страницы видны
    Когда пользователь кликает на Автокредиты
    Тогда отображается страница Автокредиты
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница Автокредита
    Когда пользователь кликает на подробной странице на вкладку "Условия"
    Тогда отображается на подробной странице вкладка "Условия"
    Когда пользователь кликает на подробной странице на вкладку "Документы"
    Тогда отображается на подробной странице вкладка "Документы"
    Когда пользователь кликает на подробной странице на вкладку "Отзывы"
    Тогда отображается на подробной странице вкладка "Отзывы"
    Когда пользователь кликает на подробной странице на вкладку "Об организации"
    Тогда отображается на подробной странице вкладка "Об организации"
    Когда пользователь кликает на подробной странице на вкладку "Предложения"
    Тогда отображается на подробной странице вкладка "Предложения"

  @test
  @TestCaseId("18")
  @Severity(Critical)
  Сценарий: Блок Ипотека. Отображение подробной страницы ипотеки
    Дано пользователь нахоидится на главной странице
    И все элементы главной страницы видны
    Когда пользователь кликает на Ипотека
    Тогда отображается страница Ипотека
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница Ипотеки
    Когда пользователь кликает на подробной странице на вкладку "Условия"
    Тогда отображается на подробной странице вкладка "Условия"
    Когда пользователь кликает на подробной странице на вкладку "Документы"
    Тогда отображается на подробной странице вкладка "Документы"
    Когда пользователь кликает на подробной странице на вкладку "Отзывы"
    Тогда отображается на подробной странице вкладка "Отзывы"
    Когда пользователь кликает на подробной странице на вкладку "Об организации"
    Тогда отображается на подробной странице вкладка "Об организации"
    Когда пользователь кликает на подробной странице на вкладку "Предложения"
    Тогда отображается на подробной странице вкладка "Предложения"

  @test
  @TestCaseId("19")
  @Severity(Critical)
  Сценарий: Блок Микрозаймы. Отображение подробной страницы микрозайма
    Дано пользователь нахоидится на главной странице
    И все элементы главной страницы видны
    Когда пользователь кликает на Микрозаймы
    Тогда отображается страница Микрозаймы
    И пользователь выбирает локацию "Москва"
    Когда пользователь нажимает Подробнее в оффере
    Тогда открывается дополнительная информация об оффере
    Когда пользователь нажимает Перейти
    Тогда отображается подробная страница Микрозайма


  @test
  @TestCaseId("20")
  @Severity(Critical)
  Сценарий: Блок Рефинансирование. Отображение подробной страницы банка рефинансирования
    Дано пользователь нахоидится на главной странице
    И все элементы главной страницы видны
    Когда пользователь нажимает Рефинансирование в Хэдэре
    Тогда отображается страница Рефинансирование
    И пользователь выбирает локацию "Москва"
    Когда пользователь кликает на название банка
    Тогда отображается подробная страница рефинансирования
    Когда пользователь кликает на подробной странице на вкладку "Условия"
    Тогда отображается на подробной странице вкладка "Условия"
    Когда пользователь кликает на подробной странице на вкладку "Документы"
    Тогда отображается на подробной странице вкладка "Документы"
    Когда пользователь кликает на подробной странице на вкладку "Отзывы"
    Тогда отображается на подробной странице вкладка "Отзывы"
    Когда пользователь кликает на подробной странице на вкладку "Об организации"
    Тогда отображается на подробной странице вкладка "Об организации"
    Когда пользователь кликает на подробной странице на вкладку "Предложения"
    Тогда отображается на подробной странице вкладка "Предложения"

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

  @test
  @TestCaseId("55")
  @Severity(Critical)
  Сценарий: Блок Защита от мошенников. Отображение подробной страницы Защиты от мошенников
    Дано пользователь нахоидится на главной странице
    И все элементы главной страницы видны
    Когда пользователь кликает на Защита от мошенников
    Тогда отображается страница Защита от мошенников

  @test
  @TestCaseId("56")
  @Severity(Critical)
    Сценарий: Проверка отображения страницы Персональный подбор кредита через кнопку в вертекали
    Дано пользователь нахоидится на странице Кредиты
    И отображается страница Кредиты
    Когда пользователь нажимает кнопку Персональный займ
    Тогда отображается страница Персональный подбор кредита


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