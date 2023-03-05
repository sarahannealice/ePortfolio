/*
author: sarah newman
date: march 2, 2023

most recent update: march 3, 2023
*/

var theme = document.getElementById('theme');

if (localStorage.getItem('theme')) {
    theme.setAttribute('href', localStorage.getItem('theme'));
}

/*theme toggle -- https://stackoverflow.com/a/18368517*/

function switchTheme() {
    var a = document.getElementById('theme');
    a.x = 'css/styles_night' == a.x ? 'css/styles_day' : 'css/styles_night'; // short if
    //let status = a.href = a.x + '.css';

    localStorage.setItem('theme', (a.href = a.x + '.css'));
}