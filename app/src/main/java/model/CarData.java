package model;

import java.util.ArrayList;
import java.util.List;

public class CarData implements Icardata {
    private ArrayList<Car> cars = new ArrayList<>();

    public CarData() {
        cars.add(new Car("Mercedes e200", "Mercedes", "123", "black", 200000.0));
        cars.add(new Car("Mercedes C200", "Mercedes", "1234", "black", 300000.0));
        cars.add(new Car("ford fiesta", "ford", "122", "black", 30000.0));
        cars.add(new Car("fiat panda", "fiat", "123", "black", 20000.0));

    }

    @Override
    public List<Car> getcars(String type) {
        ArrayList<Car> data = new ArrayList<>();
        for (Car c : cars) {
            if (c.getType().equals((type))) {
                data.add(c);
            }
        }
        return data;
    }

    @Override
    public String[] gettypes() {
        String[] types = new String[]{"Mercedes", "fiat", "ford"};
        return types;
    }
}






