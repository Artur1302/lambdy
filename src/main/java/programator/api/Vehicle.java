package programator.api;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface Vehicle {
    public static final Predicate<Vehicle> FILTER_CARS = v -> v instanceof Car; // od v to predykat
    public static final Predicate<Vehicle> FILTER_BOATS = v -> v instanceof Boat;
    public static final Predicate<Vehicle> FILTER_PLANES = v -> v instanceof Plane;

        String start();

        static List<Vehicle> filteredList(List<Vehicle> list, Predicate<Vehicle> predicate) {
            return list.stream()
                    .peek(v -> System.out.println(v))
                    .filter(predicate)
                    .collect(Collectors.toList());
        }
}
