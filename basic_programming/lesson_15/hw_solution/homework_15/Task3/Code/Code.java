package Code;
/*
Штрих-код имеет строго регламентированную длину, то есть количество цифр, которое в нем содержится
(обычно это 8 или 13 цифр). Создать класс Code, в котором реализовать методы:

lengthCode(long code), который возвращает длину штрих-кода
controlSum(long code), который возвращает сумму всех цифр штрих кода
isValid(long code), который проверяет штрих-код на правильное количество цифр
 */
public class Code {
    public int lengthCode(long code) {
        return String.valueOf(code).length();
    }

    public int controlSum(long code) {
        String codeStr = String.valueOf(code);
        int sum = 0;
        for (int i = 0; i < codeStr.length(); i++) {
            sum += Character.getNumericValue(codeStr.charAt(i));
        }
        return sum;
    }

    public boolean isValid(long code) {
        int length = lengthCode(code);
        return length == 8 || length == 13;
    }

}
