package Java8Features.Optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> name = getName(1);
        if(name.isPresent()){
            System.out.println(name.get());
        }

        // name.ifPresent(x -> System.out.println(x)); // Idhr pe x wo value hai jo optional k ander present hai.
        name.ifPresent(System.out :: println); // This method takes a consumer: Idhr pe x wo value hai jo optional k ander present hai.

        // String yourname = name.isPresent() ? name.get() : "Name not present";
        String yourname1 = name.orElse("Name not Preseent");
        System.out.println(yourname1);

        String youname2 = name.orElseGet(() -> "Name not present"); // This method take supplier
        System.out.println(youname2);

        // String youname3 = name.orElseThrow(() -> new NoSuchElementException()); // This method take supplier
        String youname3 = name.orElseThrow(NoSuchElementException::new); // This method take supplier
        System.out.println(youname3);


        Optional<String> yourname4 = name.map(x -> x.toUpperCase());
        yourname4.ifPresent(System.out::println);

        Optional<String> yourname5 = name.filter(x -> x.startsWith("R"));
        System.out.println(yourname5.isPresent());

    }

    private static Optional<String> getName(int id){
        // get from db
         String name = "Ram";
        // String name = null;
        // return Optional.of(name); // Does not handle null value so will get null pointer exception
        // return Optional.empty();
        return Optional.ofNullable(name);
    }
}
