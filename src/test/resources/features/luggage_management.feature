Feature: Gestión de Equipaje
  Como usuario del sistema
  Quiero acceder a la página de gestión de equipaje
  Para administrar el equipaje de los pasajeros

  Scenario: Acceso exitoso a la página de gestión de equipaje
    Given que ingreso a la pagina de equipaje
    When espero que la pagina cargue completamente
    Then debo ver la pagina de gestion de equipaje