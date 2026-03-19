describe('Custom Commands', () => {

  it('Login exitoso usando comando personalizado', () => {
    cy.login('tomsmith', 'SuperSecretPassword!')
    cy.contains('You logged into a secure area!').should('be.visible')
  })

  it('Login fallido usando comando personalizado', () => {
    cy.login('tomsmith', 'password-incorrecta')
    cy.contains('Your password is invalid!').should('be.visible')
  })

})