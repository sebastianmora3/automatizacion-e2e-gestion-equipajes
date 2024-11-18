#Author:
#Language: es

Feature: Gestión de Equipaje
  Como usuario del sistema
  Quiero acceder a la página de gestión de equipaje
  Para administrar el equipaje de los pasajeros

  Scenario: Acceso exitoso a la página de gestión de equipaje
    Given que el usuario ingresa a la pagina de equipaje
    When el usuario espera que la pagina cargue completamente
    Then debe ver la pagina de gestion de equipaje