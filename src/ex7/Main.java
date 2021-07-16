package ex7;

import java.util.ArrayList;
import java.util.List;

/*Есть набор предметов, задаётся заранее, предметы могут повторяться.
 Предмет имеет 2 параметра (обязательных, остальные на усмотрения, типа имя и т.д.),
 объём (целое значение) и ценность (целое значение).
 Предметы неделимы.
 Задаётся размер сейфа, параметром его объёма (целое значение).
 Нужно написать программу, которая набивает сейф набором предметов, таким образом чтобы ценность этого набора была максимальной.
*/

public class Main {


    public static void main(String[] args) {
        Safe safe = new Safe(4);
        List<Thing> things = new ArrayList<>();
        things.add(new Thing("ring of omnipotence",1, 3000));
        things.add(new Thing("dragon egg",4, 2500));
        things.add(new Thing("cup of eternal youth",3,3100));
        System.out.println(safe.addToSafe(things));
    }

}
