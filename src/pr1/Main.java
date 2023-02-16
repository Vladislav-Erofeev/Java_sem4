package pr1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Student[] array = {new Student("test1", "gr1"),
                new Student("test2", "gr1"),
                new Student("test3", "gr2"),
                new Student("test4", "gr2")};
        Function<Student[], Map<String, List<Student>>> function = (arr) -> {
            Map<String, List<Student>> ans = new HashMap<>();
            for(int i = 0; i < arr.length; i++) {
                if(ans.containsKey(arr[i].group)) {
                    ans.get(arr[i].group).add(arr[i]);
                } else {
                    List<Student> list = new LinkedList<>();
                    list.add(arr[i]);
                    ans.put(arr[i].group, list);
                }
            }
            return ans;
        };

        Map<String, List<Student>> newArray = function.apply(array);
        for(Map.Entry<String, List<Student>> item : newArray.entrySet()) {
            System.out.println(item.getKey() + "-----");
            for(Student x : item.getValue()) {
                System.out.println(x.name);
            }
        }
    }
}
