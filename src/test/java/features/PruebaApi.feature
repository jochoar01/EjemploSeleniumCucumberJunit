Feature: Validacion Facebook

  Como usuario quiero leer chistes de Testers

  Scenario Outline: Ingresar a la categoria comics desde la pantalla home

    Given  que puedo usar la url "<endpoint>"
    When   hacer consumo de api
    Then   valido en el "<nodo>" el "<valor>"

    Examples:
      | endpoint                                       | nodo     | valor |
      | http://www.omdbapi.com/?apikey=99ef2dab&s=thor | response | True  |
      | http://www.omdbapi.com/?apikey=99ef2dab&s=thor | response | Truel |




