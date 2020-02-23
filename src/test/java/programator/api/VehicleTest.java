package programator.api;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test

    void shouldReturnCarsOnly_when_FILTER_CARS_predicate_used() {
        //  TODO 1 tworzymy listę vehicli ( 3 samochpody, 7 innych)

        List<Vehicle> listToBeFiltered = Arrays.asList(
                new Car(),
                new Car(),
                new Car(),
                new Boat(),
                new Boat(),
                new Boat(),
                new Boat(),
                new Plane(),
                new Plane(),
                new Plane()
        );

        // TODO 2 filtrujemy samochody uzywajac metody statycznej inefejsu
                List<Vehicle> filterList = Vehicle.filteredList(listToBeFiltered,Vehicle.FILTER_CARS);

        // TODO 3 sprawdzamy czy własciwa ilośc elementów
        assertEquals(3,filterList.size());
    }
}