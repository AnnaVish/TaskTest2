# language: ru
@header

Функционал: Проверка что все переходы в header корректно работают

  @test
  @TestCaseId("41")
  @Severity(Critical)
  Сценарий: Прокликать все ссылки в Header
    Дано пользователь нахоидится на главной странице
    Тогда все элементы главной страницы видны
    Когда пользователь нажимает Сервисы в Хэдэре
    Тогда отображается страница Сервисы
    Когда пользователь нажимает Частным клиентам в Хэдэре
    Тогда все элементы главной страницы видны
    Когда пользователь нажимает Кредиты в Хэдэре
    Тогда отображается страница Кредиты
    Когда пользователь нажимает на Логотип
    Тогда все элементы главной страницы видны
    Когда пользователь нажимает Кредитные карты в Хэдэре
    Тогда отображается страница Кредитные карты
    Когда пользователь нажимает Автокредиты в Хэдэре
    Тогда отображается страница Автокредиты
    Когда пользователь нажимает Ипотека в Хэдэре
    Тогда отображается страница Ипотека
    Когда пользователь нажимает Микрокредиты в Хэдэре
    Тогда отображается страница Микрозаймы
    Когда пользователь нажимает Рефинансирование в Хэдэре
    Тогда отображается страница Рефинансирование
    Когда пользователь нажимает Прочее в Хэдэре
    Тогда в хэдэре видно - банки и МФО
    Когда пользователь нахоидится на главной странице
    Тогда все элементы главной страницы видны
    И пользователь делает скролл в футэру
    То хэдэр уменьшается
