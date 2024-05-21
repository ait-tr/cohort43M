package code.mapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsDemo3 {
    public static void main(String[] args) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods(1234567,"Milk",2.56));
        goodsList.add(new Goods(12345678,"Bred",0.96));
        goodsList.add(new Goods(1345676890,"Butter",1.12));
        goodsList.add(new Goods(234567,"Soap",3.12));
        goodsList.add(new Goods(2345678,"Toothpaste",2.70));


        Map<Integer,List<Goods>> goodsMap = new HashMap<>();

        /*
        поскольку у нас в списке товаров присутствуют товары только двух категорий
        - продукты и НЕ продукты, то для их хранения нам достаточно всего двух записей
        для этого создадим два ключа, где товары, начинающиеся на 1 - продукты,
        а на 2 - промтовары

        Мы можем просто добавить в качестве значения просто новые пустые list,
        которые потом будем заполнять ссылками на нужные товары

         */

        goodsMap.put(1,new ArrayList<>());
        goodsMap.put(2,new ArrayList<>());
        List<Goods> firstList = goodsMap.get(1);
        List<Goods> secondList = goodsMap.get(2);


        //----------- как из List получить Map --------

        for (Goods goods : goodsList) {
            if (goods.getFirstDigitOfCode() == 1) {
                firstList.add(goods);
            }
            if (goods.getFirstDigitOfCode() == 2) {
                secondList.add(goods);
            }
        }


        System.out.println(goodsMap);

    }
}
