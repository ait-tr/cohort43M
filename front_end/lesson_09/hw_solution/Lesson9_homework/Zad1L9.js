class Plant {
    constructor(height, age) {
        this.height = height;
        this.age = age;
    }

    grow() {
        this.height += 10;
    }
}

class Rose extends Plant {
    constructor(height, age, numberOfFlowers) {
        super(height, age);
        this.numberOfFlowers = numberOfFlowers;
    }
}

// Создание об'єкта класса Rose
const rose = new Rose(50, 2, 5);
console.log("До роста:", rose.height);
rose.grow();
console.log("После роста:", rose.height);