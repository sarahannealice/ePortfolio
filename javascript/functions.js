// used to open-close project description popups
function openPopup(id) {       
    closePopup();
    document.getElementById(id).classList.add("open-popup");
}

function closePopup() {
    popup1.classList.remove("open-popup");
    popup2.classList.remove("open-popup");
    popup3.classList.remove("open-popup");
    popup4.classList.remove("open-popup");
}