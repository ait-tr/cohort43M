// #CATEGORY_FLEX_BLOCK

const category_flex_block = document.querySelector('#category_flex_block');

const categories_flex_data = [
    {
      id: 1,
      category: "Women's",
      img: 'media/category_women.png'
    },
    {
      id: 2,
      category: "Men's",
      img: 'media/category_men.png'
    },
    {
      id: 3,
      category: "Kids'",
      img: 'media/category_child.png'
    }
  ]

  categories_flex_data.forEach(({category, img})=>{
    const cardElem = document.createElement('div');
    const imgElem = document.createElement('div');
    const categoryElem = document.createElement('p');

    categoryElem.innerText = category;
    cardElem.classList.add('category_card');

    imgElem.style.backgroundImage = `url('${img}')`

    cardElem.append(imgElem,categoryElem)

    category_flex_block.append(cardElem)
  })
  // #CATEGORY_FLEX_BLOCK
// Эта часть кода создает карточки категорий и добавляет их в элемент category_flex_block.

// const category_flex_block = document.querySelector('#category_flex_block');
//: Выбирает элемент с идентификатором category_flex_block.

// const categories_flex_data: Содержит массив объектов,
//  каждый из которых представляет категорию с ее идентификатором, названием и URL-адресом изображения.

// categories_flex_data.forEach(...): Перебирает каждый объект в массиве categories_flex_data.
// Внутри цикла создается элемент div для каждой категории (cardElem),
// элемент div для изображения категории (imgElem) и элемент p для названия категории (categoryElem).
// Устанавливает текст categoryElem в название категории.
// Добавляет CSS-класс category_card к cardElem.
// Устанавливает фоновое изображение imgElem в URL-адрес изображения.
// Добавляет imgElem и categoryElem к cardElem.
// Добавляет cardElem в category_flex_block.
//=====================================================================================


// #NEW_ARRIVALS_BLOCK

const new_arrivals_container = document.querySelector('.new_arrivals_container');

const new_arrivals_data = [
    {
      id: 1,
      img: 'media/cap.png',
      title: 'Black and white sport cap',
      price: '15.00'
    },
    {
      id: 2,
      img: 'media/glasses.png',
      title: 'Metal bridge sunglasses',
      price: '20.00'
    },
    {
      id: 3,
      img: 'media/body.png',
      title: 'Green baby romper',
      price: '18.95'
    },
    {
      id: 4,
      img: 'media/pants.png',
      title: 'Mid-rise slim cropped fit jeans',
      price: '98.10'
    },
    {
      id: 5,
      img: 'media/ears_rings.png',
      title: 'Red dangle earrings',
      price: '45.30'
    },
    {
      id: 6,
      img: 'media/child_shoes.png',
      title: 'Baby shoes with laces',
      price: '77.54'
    }
  ]

  new_arrivals_data.forEach(({img, title, price})=>{
    const cardElem = document.createElement('div');
    const imgElem = document.createElement('div');
    const titleElem = document.createElement('p');
    const priceElem = document.createElement('p');
    const heartElem = document.createElement('p');

    imgElem.style.backgroundImage = `url('${img}')`
    cardElem.classList.add('new_arrival_card');
    heartElem.classList.add('fa-regular ');
    heartElem.classList.add('fa-heart');
    heartElem.classList.add('heartElem');
    titleElem.classList.add('new_arrival_title');
    priceElem.classList.add('new_arrival_price');

    heartElem.addEventListener('click',()=>heartElem.classList.toggle('liked'))

    titleElem.innerText = title;
    priceElem.innerText = `EUR ${price}`

    imgElem.append(heartElem)
    cardElem.append(imgElem, titleElem,priceElem)
    new_arrivals_container.append(cardElem)

    // #NEW_ARRIVALS_BLOCK
// Этот раздел создает карточки новых поступлений и добавляет их в элемент new_arrivals_container.

// const new_arrivals_container = document.querySelector('.new_arrivals_container');
//: Выбирает элемент с классом new_arrivals_container.

// const new_arrivals_data: Содержит массив объектов, каждый из которых представляет товар новых поступлений
// с его идентификатором, URL-адресом изображения, названием и ценой.

// new_arrivals_data.forEach(...): Перебирает каждый объект в массиве new_arrivals_data.
// Внутри цикла создается элемент div для каждого товара (cardElem),
// элемент div для изображения (imgElem), и элементы p для названия (titleElem),
// цены (priceElem) и иконки сердца (heartElem).

// Устанавливает фоновое изображение imgElem в URL-адрес изображения.
// Добавляет CSS-классы элементам для стилизации.

// Добавляет обработчик событий для иконки сердца (heartElem), чтобы переключать класс liked при клике.
// Устанавливает текст titleElem в название и priceElem в цену.
// Добавляет heartElem, titleElem и priceElem к imgElem.
// Добавляет imgElem к cardElem.
// Добавляет cardElem в new_arrivals_container




  })


