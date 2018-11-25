import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Henry on 2018/11/23.
 */
public class Sorting {
    static class Apple{
        private Integer weight = 0;
        private String color = "";

        public Apple(Integer weight, String color){
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static void main(String[] args){
        List<Apple> inventory = new ArrayList<>();
        inventory.addAll(Arrays.asList(new Apple(80,"green"), new Apple(155, "green"),
                new Apple(120, "red"), new Apple(120, "aaa")));
//        inventory.sort(new AppleComparator());
//        System.out.println(inventory);
//        inventory.sort(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return o1.getWeight().compareTo(o2.getWeight());
//            }
//        });
//        inventory.sort((a1, a2) ->
//            a1.getWeight().compareTo(a2.getWeight())
//        );
//        inventory.sort(Comparator.comparing((a) -> a.getWeight()));
        inventory.sort(Comparator.comparing(Apple::getWeight)
                .reversed().thenComparing(Apple::getColor));
        System.out.println(inventory);

    }
    static class AppleComparator implements Comparator<Apple>
    {

        @Override
        public int compare(Apple o1, Apple o2) {
            return o1.getWeight().compareTo(o2.getWeight());
        }
    }

}
