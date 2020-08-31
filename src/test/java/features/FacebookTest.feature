Feature: Validacion Facebook

  Como usuario quiero leer chistes de Testers

  Scenario Outline: Ingresar a la categoria comics desde la pantalla home

    Given  El usuario puede acceder a pagina principal de facebook
    When   se hace el registro en facebook
    Then   y se valida letrero "<Letrero>"

    Examples:
    |Letrero|
    |Sign Up|
    |Sign Up|
    |Sign2 Up|



