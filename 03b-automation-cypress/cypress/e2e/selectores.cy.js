describe('Práctica de selectores CSS', () => {

  const URL = 'https://the-internet.herokuapp.com/login'

  beforeEach(() => {
    cy.visit(URL)
  })

  it('Seleccionar por ID', () => {
    cy.get('#username').should('be.visible')
    cy.get('#password').should('be.visible')
  })

  it('Seleccionar por atributo type', () => {
    cy.get('[type="submit"]').should('be.visible')
  })

  it('Seleccionar por texto visible', () => {
    cy.contains('Login').should('be.visible')
  })

  it('Seleccionar el formulario y buscar dentro', () => {
    cy.get('form').find('#username').type('tomsmith')
    cy.get('form').find('#password').type('SuperSecretPassword!')
    cy.get('form').find('[type="submit"]').click()
    cy.contains('You logged into a secure area!').should('be.visible')
  })

})