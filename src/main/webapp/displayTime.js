function getTime() {
    var offset = new Date().getTimezoneOffset() / 60;
    console.log(offset);
    var xhttp = new XMLHttpRequest();
    var timeURL = "https://codeminators.herokuapp.com/api/time/";
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(this.responseText);
            setTime(new Date(this.responseText));
        }
    };
    xhttp.open("GET", timeURL + offset, true);
    xhttp.send();
}

function setTime(time) {
    var current = (time.getMonth() + 1) + time.getDate() + time.getFullYear() + " " + time.getHours() + time.getMinutes();
    document.getElementById("time").innerHTML = current;
}

getTime();