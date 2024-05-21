package code.mapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsDemo2 {
    public static void main(String[] args) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods(1234567,"Milk",2.56));
        goodsList.add(new Goods(2345678,"Bred",0.96));
        goodsList.add(new Goods(345676890,"Butter",1.12));


        Map<Integer,Goods> goodsMap = new HashMap<>();


        //----------- как из List получить Map --------

       for (Goods goods : goodsList) {
           goodsMap.put(goods.getCode(), goods);
       }

        System.out.println(goodsMap);
    }
}
