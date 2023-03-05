/*
author: sarah newman
date: march 2, 2023

most recent update: march 3, 2023
*/


/*theme toggle -- https://stackoverflow.com/a/14293019*/
/*
function switchTheme(sheet) {
  document.getElementById("theme").setAttribute("href", sheet);
}

function initiate() {
  var night = document.getElementById("night_mode");
  var day = document.getElementById("day_mode");

  night.onclick = function() { switchTheme("../css/styles_night.css") };
  day.onclick = function() { switchTheme("../css/styles_day.css") };
}

window.onload = initiate;
*/

function switchTheme() {
  var a = document.getElementById("theme");
  a.x = 'styles_night' == a.x ? 'styles_day' : 'styles_night';
  a.href = a.x + '.css';
}

/*
function toggle() {
  var el1 = document.getElementById("style1"),
      el2 = document.getElementById("style2");
  if (el1.disabled === "disabled") {
    el1.disabled = undefined;
    el2.disabled = "disabled";
  } else {
    el1.disabled = "disabled";
    el2.disabled = undefined;
  }
}
*/