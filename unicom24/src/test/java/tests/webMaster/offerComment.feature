# language: ru
@firstTest

Функционал: Проверка работы оставления отзыва на офер

  @test
  @db_query
  @TestCaseId("60")
  @Severity(Critical)
  Сценарий: Проверка отзыва на офер
    Дано пользователь нахоидится на главной странице
    Когда пользователь нажимает на кнопку войти
    Тогда отображается страница авторизации
    И пользователь авторизовывается
    Тогда пользователь авторизован
    Дано пользователь нахоидится на странице Кредиты
    И отображается страница Кредиты
    Когда пользователь кликает на название банка
    Тогда отображается страница банка с предложениями
    Когда пользователь кликает на отзывы
    Тогда отображаются отзывы
    И пользователь кликает на кнопку Написать отзыв
    Тогда пользователь видит форму оставления коментария
    И пользователь заполняет форму оставления коментария
    И пользователь видет сообщение об успешной отправке коментария
    И проверка создания отзыва в базе данных
