describe('Login con Fixtures', () => {

  beforeEach(() => {
    cy.visit('/login')
  })

  it('Login exitoso usando datos desde fixture', () => {
    cy.fixture('usuarios').then((data) => {
      cy.get('#username').type(data.valido.username)
      cy.get('#password').type(data.valido.password)
      cy.get('button[type="submit"]').click()
      cy.contains('You logged into a secure area!').should('be.visible')
    })
  })

  it('Login fallido usando datos desde fixture', () => {
    cy.fixture('usuarios').then((data) => {
      cy.get('#username').type(data.invalido.username)
      cy.get('#password').type(data.invalido.password)
      cy.get('button[type="submit"]').click()
      cy.contains('Your password is invalid!').should('be.visible')
    })
  })

})