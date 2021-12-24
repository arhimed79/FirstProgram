package lessons15;


import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextCheck {
    public static void main(String[] args) {


        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at" +
                " faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit" +
                " tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula " +
                "mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel" +
                "odio nec mi tempor dignissim. ";

        text = text.replaceAll("[^A-Za-zА-Яа-я0-9 ]", "");
        List<String> myList = Collections.singletonList(Stream.of(text.split(" "))
                .peek(System.out::println)
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new))
                       .toString());


        System.out.println("_________________________");
        System.out.println(myList);

        // }
        // System.out.println(myList);

    }
}
