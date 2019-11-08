function getTime() {
    var offset = new Date().getTimezoneOffset() / 60;
    console.log(offset);
    var xhttp = new XMLHttpRequest();
    var timeURL = "https://codeminators.herokuapp.com/api/time/";
    xhttp.onreadystatechange = function () {
        console.log(this.status);
        if (this.readyState == 4 && this.status == 200) {
            console.log(this.responseText, typeof (this.responseText));
            // var l = new Date(this.responseText);
            // console.log(l);
            // setTime(new Date(this.responseText));
            var val = this.responseText.split("T");
            document.getElementById("time").innerHTML = val[0] + " " + val[1];
        }
    };
    xhttp.open("GET", timeURL + offset, true);
    xhttp.send();
}

function setTime(time) {
    console.log(time);
    if (!time) return;
    var current = (time.getMonth() + 1) + time.getDate() + time.getFullYear() + " " + time.getHours() + time.getMinutes();
    document.getElementById("time").innerHTML = current;
}

getTime();