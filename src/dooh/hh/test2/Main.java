package dooh.hh.test2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Программа в составе содержит модуль для расчета стоимости путешествия на основе используемого автомобиля
 * и других данных. Что в этом коде кажеться не правельным ,модифицируйте его так,что бы в дальнейшем разработчик
 * мог добавлять новую марку автомобиля с минимальными трудозатратами
 */


public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Ford(), new Opel());
        for (Car car : cars) {
            new Travel(car).doTravel();
        }
    }


}

class Travel {
    private Car car;

    public Travel(Car car) {
        this.car = car;
    }

    public void doTravel() {
        if (car != null) {
            System.out.println(car.getRepairCost() * someInnerLogic());
        }
    }

    public static float someInnerLogic() {
        return new Random().nextFloat() + 1;
    }
}

class Ford extends CarParam {
    private static int amortization = 5;
    private static int repair = 100;

    public Ford() {
        super(amortization, repair);
    }

    @Override
    public int getRepairCost() {
        return getAmortization() * 5 + getRepair();
    }
}

class Opel extends CarParam {
    private static int amortization = 10;
    private static int repair = 200;

    public Opel() {
        super(amortization, repair);
    }

    @Override
    public int getRepairCost() {
        return getAmortization() * 3 + getRepair();
    }
}
