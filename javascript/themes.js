/*
author: sarah newman
date: march 2, 2023

most recent update: march 3, 2023
*/

/*theme toggle*/
function toggleTheme() {
  var theme = document.getElementsByTagName('link')[0];

  if (theme.getAttribute('href') == '../css/styles_day.css') {
      theme.setAttribute('href', '../css/styles_night.css');
  } else {
      theme.setAttribute('href', '../css/styles_day.css');
  }
}