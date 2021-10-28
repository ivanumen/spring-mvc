package web.model;

public class Cars {
    private int id;
    private String model, color;

    public Cars() {}

    public Cars(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
