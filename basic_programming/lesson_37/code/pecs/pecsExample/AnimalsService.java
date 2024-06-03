package code.pecs.pecsExample;

import java.util.List;

public class AnimalsService {

    // Producer Extends
    /*
    Если коллекция является производителем значений (мы только ЧИТАЕМ значения из коллекции)
    то используем 'extends'

    Это позволяет использовать коллекции, содержащие элементы, которые являются ПОДКЛАССАМИ указанного типа данных
     */
    public void processAnimal(List<? extends Animal> animals){
        for (Animal animal : animals){
            System.out.println(animal);
        }
    }

    // Consumer Super
    /*
     Если коллекция является потребителем значений (мы ДОБАВЛЯЕМ значения в коллекции)
    то используем 'super'

    Это позволяет использовать коллекции, в которые можно добавить элементы указанного типа или его подтипов

     */

    public void addDog(List<? super Dog> animals){
        animals.add(new Dog());
    }
}
