describe('Login - The Internet', () => {

  // URL base que usaremos en todos los tests
  const URL = 'https://the-internet.herokuapp.com/login'

  it('1. Debe mostrar el campo username al cargar la página', () => {
    cy.visit(URL)
    cy.get('#username').should('be.visible')
  })

  it('2. Login exitoso con credenciales válidas', () => {
    cy.visit(URL)
    cy.get('#username').type('tomsmith')
    cy.get('#password').type('SuperSecretPassword!')
    cy.get('button[type="submit"]').click()
    cy.contains('You logged into a secure area!').should('be.visible')
  })

  it('3. Login fallido con contraseña incorrecta', () => {
    cy.visit(URL)
    cy.get('#username').type('tomsmith')
    cy.get('#password').type('contraseña-incorrecta')
    cy.get('button[type="submit"]').click()
    cy.contains('Your password is invalid!').should('be.visible')
  })

})