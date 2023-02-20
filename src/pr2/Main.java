package pr2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new LinkedList<>();
        list.add(new Human(19, "Vlad", "Erofeev", LocalDate.of(2003, 11, 19), 78));
        list.add(new Human(20, "test1", "t1", LocalDate.of(2002, 11, 19), 74));
        list.add(new Human(18, "test2", "t2", LocalDate.of(2004, 11, 19), 75));
        list.add(new Human(15, "test3", "t3", LocalDate.of(2007, 11, 19), 72));
        list.add(new Human(11, "test4", "t4", LocalDate.of(2012, 11, 19), 120));
        list.add(new Human(53, "test5", "t5", LocalDate.of(2012, 11, 19), 54));
        list.add(new Human(52, "test6", "t6", LocalDate.of(2012, 11, 19), 67));
        list.add(new Human(65, "test7", "t7", LocalDate.of(2012, 11, 19), 79));
        Stream<Human> stream = list.stream();

        // сортировка по дате рождения
        System.out.println("Сортировка по возрасту: ");
        stream.sorted((o1, o2) ->
        {if(o1.age > o2.age)
            return 1;
        else if (o1.age < o2.age)
            return -1;
        return 0;}
        ).forEach(System.out::println);

        // фильтрация по возрасту
        stream = list.stream();
        System.out.println("Фильтрация по возрасту: ");
        stream.filter(human -> human.age < 50).forEach(System.out::println);

        // сортировка по весу
        stream = list.stream();
        System.out.println("Сортировка по весу: ");
        stream.sorted((o1, o2) ->
                {if(o1.weight > o2.weight)
                    return 1;
                else if (o1.weight < o2.weight)
                    return -1;
                    return 0;}
        ).forEach(System.out::println);

        // конкатенация всех имён
        stream = list.stream();
        System.out.println("Конкатенация всех имён: ");
        System.out.println(stream.reduce((o1, o2) -> {o1.firstName += " " + o2.firstName; return o1;}).get().firstName);
    }
}
