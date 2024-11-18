Feature: Verificacion de opciones de equipaje en cabina y bodega
  Como usuario de la aplicacion
  Quiero ver las diferentes opciones de equipaje en cabina y bodega
  Para poder seleccionar la que necesito

  Scenario: Verificar opciones de equipaje en cabina
    Given que el usuario ingresa a la pagina de equipaje
    When el usuario visualiza las opciones de equipaje en cabina
    Then debe ver la opcion "1 Bolso o mochila pequeña" con descripcion "Bajo el asiento delantero"
    And debe ver que esta opcion esta "incluida"
    And debe ver la opcion "1 Bolso o mochila pequeña" "+ 1 equipaje de mano"
    And debe ver el precio "COP 53900" para la opcion adicional de cabina

  Scenario: Verificar opciones de equipaje en bodega
    Given que el usuario ingresa a la pagina de equipaje
    When el usuario visualiza la seccion "¿Agregas equipaje de bodega?"
    Then debe ver la opcion de maleta de "15kg" con precio "COP 49,900.00"
    And debe ver la opcion de maleta de "23kg" con precio "COP 49,900.00"
    And debe ver un indicador "Max 3" para cada opcion de bodega
    And debe ver controles de cantidad para seleccionar el numero de maletas

  Scenario: Verificar límites de selección de equipaje de bodega
    Given que el usuario ingresa a la pagina de equipaje
    When el usuario intenta agregar mas de "3" maletas de cualquier tipo
    Then el sistema no debe permitir exceder este limite
    And debe mostrar el indicador "Max 3" de manera visible