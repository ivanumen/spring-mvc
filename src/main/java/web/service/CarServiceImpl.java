package web.service;

import org.springframework.stereotype.Service;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService{

    private static final List<Cars> cars = new ArrayList<>();

    static {
        cars.add(new Cars(1, "Toyta", "red"));
        cars.add(new Cars(2, "Lamborgini", "blue"));
        cars.add(new Cars(3, "Moskvich", "dark"));
        cars.add(new Cars(4, "Syzyki", "green"));
        cars.add(new Cars(5, "Maz", "orange"));
    }

    @Override
    public List<Cars> getCars(Integer count) {
        if (count < 1 || count > 4) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
