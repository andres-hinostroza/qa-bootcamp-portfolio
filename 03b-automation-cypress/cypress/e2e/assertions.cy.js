describe('Assertions Avanzadas', () => {

  beforeEach(() => {
    cy.visit('/login')
  })

  it('Verificar múltiples propiedades de un elemento', () => {
    cy.get('#username')
      .should('be.visible')
      .and('be.enabled')
      .and('have.attr', 'type', 'text')
  })

  it('Verificar que un elemento NO existe tras logout', () => {
    cy.get('#username').type('tomsmith')
    cy.get('#password').type('SuperSecretPassword!')
    cy.get('button[type="submit"]').click()
    cy.get('a[href="/logout"]').should('be.visible')
    cy.get('a[href="/logout"]').click()
    cy.get('a[href="/logout"]').should('not.exist')
  })

  it('Verificar el atributo href de un enlace', () => {
    cy.visit('https://the-internet.herokuapp.com')
    cy.get('a[href="/login"]').should('have.attr', 'href', '/login')
  })

  it('Verificar cantidad de elementos en una lista', () => {
    cy.visit('https://the-internet.herokuapp.com/add_remove_elements/')
    cy.get('button[onclick="addElement()"]').click()
    cy.get('button[onclick="addElement()"]').click()
    cy.get('button[onclick="addElement()"]').click()
    cy.get('.added-manually').should('have.length', 3)
  })

})