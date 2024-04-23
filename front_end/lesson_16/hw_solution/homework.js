const imageElem = document.getElementById('image')
const jokeElem = document.getElementById('joke-text')
const jokeUrlElem = document.getElementById('joke-url')

async function loadJoke(){
    const res = await fetch('https://api.chucknorris.io/jokes/random')
    const obj = await res.json()
    console.log(obj);

    const{icon_url, id, url, value} = obj
    //imageElem.src = icon_url   // ссылка на картинку на API не работает 
    jokeUrlElem.textContent = url;
    jokeElem.textContent = value
}

loadJoke()
