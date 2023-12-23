package hiber.model;

import javax.persistence.*;

@Table(name = "Car")
@Entity
public class Car {

    @Id
    @GeneratedValue
    private int id;

    @Column
    String model;
    public Car() {
    }
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Column
    int series;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @OneToOne(mappedBy = "car")
    private User user;
    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
