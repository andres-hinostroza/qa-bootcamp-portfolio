const { defineConfig } = require('cypress')

module.exports = defineConfig({
  e2e: {
    baseUrl: 'https://the-internet.herokuapp.com',
    viewportWidth: 1280,
    viewportHeight: 720,
    defaultCommandTimeout: 8000,
    pageLoadTimeout: 30000,
    video: false,
    screenshotOnRunFailure: true,
  }
})