/*
author: sarah newman
date: march 2, 2023

most recent update: december 20, 2023
*/

/*
* this file is used to alternated between light and dark mode
* it was used for a previous version and not currently being used
*/


/*theme save -- https://stackoverflow.com/a/52921937*/
var theme = document.getElementById('theme');

if (localStorage.getItem('theme')) {
    theme.setAttribute('href', localStorage.getItem('theme'));
}

/*theme toggle -- https://stackoverflow.com/a/18368517*/
function switchTheme() {
    var a = document.getElementById('theme');
    a.x = 'css/styles_night' == a.x ? 'css/styles_day' : 'css/styles_night';

    localStorage.setItem('theme', (a.href = a.x + '.css'));
}

