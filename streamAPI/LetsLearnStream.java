package streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetsLearnStream {

    public static void main(String[] args) {
        List<Integer> ls = Stream.of(1,2,3,4,9,8,12,89,55,88,67,44)
                .filter(n-> n % 2 == 0).
                    collect(Collectors.toList());
        System.out.print(ls);
    }


}
