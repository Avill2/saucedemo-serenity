Feature: Flujo de compra en SauceDemo

  Scenario: Compra exitosa de productos
    Given que el usuario ingresa a SauceDemo
    When inicia sesion con usuario "standard_user" y password "secret_sauce"
    And agrega dos productos al carrito
    And visualiza el carrito
    And completa el formulario de compra
    Then finaliza la compra y visualiza el mensaje de confirmacion