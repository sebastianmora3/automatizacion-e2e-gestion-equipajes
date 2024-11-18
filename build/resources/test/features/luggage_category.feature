Feature: Verificacion de opciones de equipaje en cabina y bodega
  Como usuario de la aplicacion
  Quiero ver las diferentes opciones de equipaje en cabina y bodega
  Para poder seleccionar la que necesito

  Scenario: Verificar opciones de equipaje en cabina
    Given que ingreso a la pagina de equipaje
    When visualizo las opciones de equipaje en cabina
    Then debo ver la opcion "1 Bolso o mochila pequeña" con descripcion "Bajo el asiento delantero"
    And debo ver que esta opcion esta "incluida"
    And debo ver la opcion "1 Bolso o mochila pequeña" "+ 1 equipaje de mano"
    And debo ver el precio "COP 53900" para la opcion adicional de cabina

  Scenario: Verificar opciones de equipaje en bodega
    Given que ingreso a la pagina de equipaje
    When visualizo la seccion "¿Agregas equipaje de bodega?"
    Then debo ver la opcion de maleta de "15kg" con precio "COP 49,900.00"
    And debo ver la opcion de maleta de "23kg" con precio "COP 49,900.00"
    And debo ver un indicador "Max 3" para cada opcion de bodega
    And debo ver controles de cantidad para seleccionar el numero de maletas

  Scenario: Verificar límites de selección de equipaje de bodega
    Given que ingreso a la pagina de equipaje
    When intento agregar mas de "3" maletas de cualquier tipo
    Then no se me debe permitir exceder este limite
    And debe mostrar el indicador "Max 3" de manera visible