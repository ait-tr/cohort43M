/*Задание 2 *
Создайте функцию, которая бы принимала бы следующие параметры:
код погоды
функция decode, которая дает расшифровку погоды по коду.
Функция должна возвращать строку, описывающую погоду.
Таблица соответствия код-описание:
SQ – шквал
PO – пыльный вихрь
FC - торнадо
BR – дымка (видимость от 1 до 9 км)
HZ – мгла (видимость менее 10 км)
FU – дым (видимость менее 10 км)
DS - пыльная буря (видимость менее 10 км)
SS - песчаная буря (видимость менее 10 км)
Подсказка: удобно использовать в одном из методов switch-case:
switch (expression) {
    case value1:
        <код>
    case value2:
        <код>
// …
    case valueN:
        <код>
    default:
        <код>
}*/
function decodeWeather(weatherCode, decode) {
    switch (weatherCode) {
        case 'SQ':
            return decode('SQ') + " - шквал";
        case 'PO':
            return decode('PO') + " - пыльный вихрь";
        case 'FC':
            return decode('FC') + " - торнадо";
        case 'BR':
            return decode('BR') + " - дымка (видимость от 1 до 9 км)";
        case 'HZ':
            return decode('HZ') + " - мгла (видимость менее 10 км)";
        case 'FU':
            return decode('FU') + " - дым (видимость менее 10 км)";
        case 'DS':
            return decode('DS') + " - пыльная буря (видимость менее 10 км)";
        case 'SS':
            return decode('SS') + " - песчаная буря (видимость менее 10 км)";
        default:
            return "Неизвестный код погоды";
    }
}

function weatherDescription(code) {
    switch (code) {
        case 'SQ':
            return "Шквал";
        case 'PO':
            return "Пыльный вихрь";
        case 'FC':
            return "Торнадо";
        case 'BR':
            return "Дымка";
        case 'HZ':
            return "Мгла";
        case 'FU':
            return "Дым";
        case 'DS':
            return "Пыльная буря";
        case 'SS':
            return "Песчаная буря";
        default:
            return "Неизвестная погода";
    }
}

// Пример
console.log(decodeWeather('SQ', weatherDescription)); // Виведе "Шквал - шквал"