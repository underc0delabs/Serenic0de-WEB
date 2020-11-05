Feature: Ingresar al a la web de underc0de y dirigirse al foro

  Scenario: Ingresar al foro de Underc0de
    Given Que estoy en la web de Underc0de
    When Ingreso al foro
    Then Verifico que exista la seccion "Underc0de"