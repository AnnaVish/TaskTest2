# language: ru
@usefullOffers

Функционал: Проверка блока Полезные услуги


  @test
  @TestCaseId("6")
  @Severity(Critical)
  Сценарий: Переходы в блоке Полезные услуги
    Дано пользователь нахоидится на главной странице
    Тогда все элементы главной страницы видны
    Когда пользователь кликает "Кредитный рейтинг" в верхней части футера
    Тогда пользователь находится на странице Рейтинг финансового здоровья без авторизации
    Когда пользователь кликает на кнопку Узнать мой рейтинг
    Тогда отображается страница авторизации
    Когда пользователь кликает "Кредитная история" в верхней части футера
    Тогда страница о полной кредитной истории отображается
    Когда пользователь нажимает кнопку Получить историю
    Тогда отображается страница авторизации
#    Когда пользователь кликает получить FICIO
#    Тогда отображается страница авторизации


  @test
  @TestCaseId("7")
  @Severity(Critical)
  Сценарий: Получить Рейтинг финансового здоровья
    Дано пользователь нахоидится на главной странице
    Тогда все элементы главной страницы видны
    Когда пользователь нажимает на кнопку войти
    Тогда отображается страница авторизации
    И пользователь авторизовывается
    И в шапке сайта видно Ваш баланс и Ваш рейтинг
    Когда пользователь кликает "Кредитный рейтинг" в верхней части футера
    Тогда отображается страница информации об отчете Рейтинга финансового здоровья
    Когда пользователь кликает Узнать свой рейтинг на странице информации об отчете Рейтинга финансового здоровья
    Тогда отображается страница Рейтинг финансового здоровья
    И пользователь нажимает получить отчет - Рейтинг финансового здоровья
    И пользователь видит что отчет по финансовому здоровью создался
    И пользователь обновляет страницу
    И пользователь видит что отчет по финансовому здоровью создался
    И пользователь скачивает отчет финансового здоровья

  @test
  @TestCaseId("8")
  @Severity(Critical)
  Сценарий: Получить отчет - Полная кредитная история
    Дано пользователь нахоидится на главной странице
    Когда пользователь нажимает на кнопку войти
    Тогда отображается страница авторизации
    И пользователь авторизовывается
    И в шапке сайта видно Ваш баланс и Ваш рейтинг
    Когда пользователь кликает "Кредитная история" в верхней части футера
    Тогда отображается промежуточная страница Полной кредитной истории
    Когда пользователь кликает на кнопку Получить историю на промежуточной странице Полной кредитной истории
    Тогда проверка страницы Полная кредитная история

  @test
  @TestCaseId("47")
  @Severity(Critical)
  Сценарий: Проверка страницы Рейтинг финансового здоровья
    Дано пользователь находится на странице Рейтинг финансового здоровья
    Когда пользователь находится на странице Рейтинг финансового здоровья без авторизации
    Тогда пользователь кликает на кнопку Узнать мой рейтинг
    Когда отображается страница авторизации
    Тогда пользователь авторизовывается
    И в шапке сайта видно Ваш баланс и Ваш рейтинг
    И отображается страница Рейтинг финансового здоровья