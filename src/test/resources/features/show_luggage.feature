Feature: Verificación de opciones de equipaje
  Como usuario de la aplicación
  Quiero ver las diferentes opciones de equipaje
  Para poder seleccionar la que necesito

  Scenario: Verificar categorias principales de equipaje
    Given que ingreso a la pagina de equipaje
    When visualizo las opciones disponibles
    Then debo ver las categorias "cabina", "bodega" y "especial"

  @OnStage
  Scenario: Verificar opciones de equipaje especial y sus costos
    Given que ingreso a la pagina de equipaje
    When hago clic en la opcion "Equipaje especial"
    Then debo ver las siguientes opciones de equipaje especial con sus costos:
      | tipo                  | precio     |
      | Instrumento musical   | 49,900.00  |
      | Equipo deportivo      | 49,900.00  |
      | Equipos adiovisuales  | 49,900.00  |
      | Guacal con mascota    | 49,900.00  |
