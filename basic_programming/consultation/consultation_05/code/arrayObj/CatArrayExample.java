package arrayObj;

public class CatArrayExample {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];

        cats[0] = new Cat("brit","Murzik","grey");
        cats[1] = new Cat("brit","Lastochka","white");
        cats[2] = new Cat("maine-kun","Baron","brawn");

        for (int i = 0; i < cats.length; i++) {
            cats[i].printData();
         //   System.out.println(cats[i]);
        }

        //System.out.println(cats[1].name);

        System.out.println(cats[0]);

    }
}
