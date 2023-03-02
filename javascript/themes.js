//

/*theme toggle*/
document.addEventListener('DOMContentLoaded', () => {
    const themeStylesheet = document.getElementById('theme')
    const themeToggle = document.getElementById('theme-toggle')
    themeToggle.addEventListener('click', () => {
      /*if it's light -> go dark*/
      if (themeStylesheet.href.includes('light')) {
        themeStylesheet.href = '../css/styles_night.css'
      } else {
        /*if it's dark -> go light*/
        themeStylesheet.href = '../css/styles_day.css'
      }
    })
  })