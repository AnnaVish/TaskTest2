# language: ru
Функционал: Регистрация Финансовый маркет

  @test4
  @TestCaseId("3")
  @Severity(Critical)
  Сценарий: Проверка регистрации нового пользователя Финансового маркета через смс
    Дано пользователь нахоидится на главной странице
    Когда пользователь нажимает на кнопку войти
    Тогда отображается страница авторизации
    Когда пользователь нажимает на Регистрация
    Тогда контент сменится на форму регистрации в поле url путь изменится на /registration
    Когда пользователь вводит новый номер и нажимает Получить пароль
    Тогда в поле ввода появится подсказка "Пароль из смс"
    Когда пользователь вводит некорректный пароль
    Тогда отображается ошибка "Неверный код подтверждения"
    Когда пользоваетль вводит корректный код подтверждения и нажимает Войти
    Тогда все элементы главной страницы видны
    И отображается панель активации
    И пользователь нажимает Активировать кабинет
    Тогда отображается страница активации аккаунта
    Когда пользователь заполняет все данные на странице активации
    Тогда пользователь нажимает на кнопку Активировать
    И отображается собщение про отправленное на почту письмо активации