import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    @Test
    public void streamFilter() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bartek");
        names.add("Kamil");
        names.add("Michał");
        names.add("Ala");
        names.add("Kasia");
        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);
        Stream.of("Kasia","Ania","Daria","Kinga").filter(s ->
        {
            s.startsWith("A");
            return true;
        }).count();
        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
    }
    @Test
    public void map(){
        Stream.of("Bartek","Kamil","Asia","Magda").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
        Stream.of("Kasia","Ania","Daria","Kinga").filter(s -> s.startsWith("a")).sorted().map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
    }
    @Test
    public void match(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bartek");
        names.add("Kamil");
        names.add("Michał");
        names.add("Ala");
        names.add("Kasia");
        Assert.assertTrue(names.stream().anyMatch(s -> s.equalsIgnoreCase("Kamil")));
    }
    @Test
    public void collect(){
       List<String> ls = Stream.of("Bartek","Kamil","Asia","Magda").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
                .collect(Collectors.toList());
       System.out.println(ls.get(0));
       List<Integer> values = Arrays.asList(1,2,3,4,1,3,3,1,2);
       values.stream().distinct().forEach(s -> System.out.println(s));
       values.stream().distinct().sorted().collect(Collectors.toList()).get(2);
    }
}
