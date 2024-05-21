package code.mapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsDemo {
    public static void main(String[] args) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods(1234567,"Milk",2.56));
        goodsList.add(new Goods(2345678,"Bred",0.96));
        goodsList.add(new Goods(345676890,"Butter",1.12));

        Integer scanCode = 1234567;

        Goods foundedGoods = null;


        for (int i = 0; i < goodsList.size(); i++) {
            if (scanCode.equals(goodsList.get(i).getCode())) {
                foundedGoods = goodsList.get(i);
            }
        }

        System.out.println(foundedGoods);


        Map<Integer,Goods> goodsMap = new HashMap<>();

        goodsMap.put(1234567, new Goods(1234567,"Milk",2.56));

        goodsMap.put(2345678,new Goods(2345678,"Bred",0.96));
        goodsMap.put(345676890,new Goods(345676890,"Butter",1.12));

        scanCode = 345676890;

        foundedGoods = goodsMap.get(scanCode);

        System.out.println(foundedGoods);


        //----------- как из List получить Map --------



    }
}
