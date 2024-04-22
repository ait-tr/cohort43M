window.onload = function() {
    function getCoordinates() {
    fetch("https://get.geojs.io/v1/ip/geo.json")
    .then(response=>response.json())
    .then(data=> {
        const latitude = data.latitude;
        const longitude = data.longitude;
        document.getElementById("coordinates").innerText="Latitude: "+latitude+" Longitude "+ longitude; 
    })
    .catch (error =>{
        console.error("error fetching coordinates:", error);
        document.getElementById("coordinates").innerText="error fetching coordinates";
    })
}
getCoordinates();
};