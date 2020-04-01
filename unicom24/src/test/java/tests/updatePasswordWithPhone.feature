# language: ru
@updatePassword

Функционал: Восстановление пароля Финансовый маркет по номеру телефона и почте

  @test
  @TestCaseId("43")
  @Severity(Critical)
  Сценарий: Проверка восстановления пароля на финансовом маркете при помощи номера телефона
    Дано пользователь нахоидится на главной странице
    Когда пользователь нажимает на кнопку войти
    Тогда отображается страница авторизации
    Когда пользователь нажимает: забыли пароль
    Тогда открывается форма восстановления пароля
    Когда пользователь вводит номер несуществующего пользователя и нажимает Отправить
    Тогда отображается ошибка "Пользователя с таким номером телефона не существует"
    Когда пользователь вводит неккоректный номер и нажимает отправить
    Тогда отображается ошибка "Введите корректный E-mail или телефон"
    Когда пользователь вводит телефон зарегистрированного пользователя, нажать "Отправить"
    Тогда в поле ввода появится подсказка "Пароль из смс"
    И под полем ввода ссылка "для повторного запроса sms осталось"
    И название кнопки изменится на "Войти"
    Когда пользователь вводит пароль из смс и нажимает на "Войти"
    Тогда в шапке сайта видно Ваш баланс и Ваш рейтинг
    И все элементы главной страницы видны

  @test
  @TestCaseId("28")
  @Severity(Critical)
  Сценарий: Проверка восстановления пароля на финансовом маркете при помощи почты
    Дано пользователь нахоидится на главной странице
    Когда пользователь нажимает на кнопку войти
    Тогда отображается страница авторизации
    Когда пользователь нажимает: забыли пароль
    Тогда открывается форма восстановления пароля
    Когда пользователь вводит почту несуществующего пользователя и нажимает Отправить
    Тогда отображается ошибка "Пользователь с указанным email не найден"
    Когда пользователь вводит неккоректный мэил и нажимает отправить
    Тогда отображается ошибка "Поле должно быть действительным электронным адресом"
    Когда пользователь вводит email зарегистрированного пользователя, нажать Отправить
    Тогда отображается уведомление "Письмо с дальнейшими инструкциями успешно отправлено!"
    Когда пользователь переходит по ссылке из письма
    Тогда выводится форма восстановления пароля с полем для ввода пароля и полем для повторного ввода пароля
    И пользователь вводит новый пароль и нажимает Сохранить
    Тогда пользователь авторизован
    И все элементы главной страницы видны