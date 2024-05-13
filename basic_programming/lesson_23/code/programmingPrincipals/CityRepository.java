package code.programmingPrincipals;

public class CityRepository {

//    private City[] cities = {
//            new City("Berlin"),
//            new City("London"),
//            new City("Paris")
//    };

    private City[] cities;

    public CityRepository(City[] cities) {
        this.cities = cities;
    }

    public void showAll(){
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i].getName());
        }
    }
}
