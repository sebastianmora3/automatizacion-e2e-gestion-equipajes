Feature: Gestión de equipaje y visualización de costos
  Como usuario de la aplicación
  Quiero gestionar mi equipaje y ver los costos asociados
  Para planificar mi viaje adecuadamente

  Scenario: Verificar cálculo y visualización de costos
    Given que ingreso a la pagina de equipaje
    When selecciono una categoria de equipaje
    Then debo ver el costo actualizado inmediatamente
    And los montos deben mostrarse con decimales separados por coma
    And los miles deben estar separados por punto
    When elimino todo el equipaje
    Then el valor total debe mostrarse como cero
