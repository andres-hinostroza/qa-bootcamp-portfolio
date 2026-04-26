describe('Login', () => {
    
    beforeEach(() => {
        cy.visit('https://the-internet.herokuapp.com/login');
    });
    
    it('should log in successfully', () => {
        cy.get('input[name="username"]').type('tomsmith'); 
        cy.get('input[name="password"]').type('SuperSecretPassword!'); 
        cy.get('button[type="submit"]').click();
        cy.get('.flash.success').should('be.visible').and('contain', 'You logged into a secure area!');
    }); 

    it('should show error message for invalid credentials', () => {
        cy.get('input[name="username"]').type('invalidUser'); 
        cy.get('input[name="password"]').type('invalidPass'); 
        cy.get('button[type="submit"]').click();
        cy.get('.flash.error').should('be.visible').and('contain', 'Your username is invalid!');
    });

}); 
