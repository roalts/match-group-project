function getTime() {
    var offset = new Date().getTimezoneOffset() / 60;
    console.log(offset);
    var xhttp = new XMLHttpRequest();
    var timeURL = "https://codeminators.herokuapp.com/api/time/";
    xhttp.onreadystatechange = function () {
        console.log(this.status);
        if (this.readyState == 4 && this.status == 200) {
            console.log(this.responseText, typeof (this.responseText));
            setTime(this.responseText);
            
        }
    };
    xhttp.open("GET", timeURL + offset, true);
    xhttp.send();
}

function setTime(time) {
    var val = time.split("\"")[0].split("T");
    document.getElementById("time").innerHTML = val[0] + " " + val[1];
}

getTime();