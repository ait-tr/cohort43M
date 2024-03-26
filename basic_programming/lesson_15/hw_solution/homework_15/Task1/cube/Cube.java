package cube;
/*
Создать класс Cube, описывающий куб cо стороной a. Реализовать в нем методы определения периметра p
(сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v. Создать приложение CubeAppl,
в котором создать несколько экземпляров класса Cube. Для каждого экземпляра вызвать методы класса Cube и рассчитать
p, s и v.
 */
public class Cube {
    private double side;
    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double calculatePerimeter() {
        return 12 * side;
    }

    public double calculateSurfaceArea() {
        return 6 * side * side;
    }

    public double calculateVolume() {
        return side * side * side;
    }
}
