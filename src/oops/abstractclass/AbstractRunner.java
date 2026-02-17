package oops.abstractclass;

import oops.abstractclass.anotherpackage.MiniAuto;

public class AbstractRunner {

    public static void main(String[] args) {
        MiniAuto miniAuto = new MiniAuto(1234);
        Auto auto = new MiniAuto(1234);
        Vehicle vehicle = new MiniAuto(1234);

        miniAuto.service();
//        System.out.println(miniAuto.regNo);
        auto.service();
        System.out.println(auto.regNo);
        System.out.println(vehicle.regNo);

    }

}
