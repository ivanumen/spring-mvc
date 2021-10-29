package web.service;

import web.model.Cars;

import java.util.List;

public interface CarService {
    public List<Cars> getCars(Integer count);
}
