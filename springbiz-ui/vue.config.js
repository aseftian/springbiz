module.exports = {
  lintOnSave: false,

  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8088',
        ws: true,
        changeOrigin: true
      }
    }
  },

  outputDir: 'target/dist',
  assetsDir: 'static'
}
