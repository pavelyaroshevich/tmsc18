package by.tms.services;

import by.tms.models.CargoCar;
import by.tms.models.CivilAirplane;
import by.tms.models.MilitaryAirplane;
import by.tms.models.PassengerCar;

public class MainTransport {
    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar(
                230,
                200,
                1790,
                "BMW",
                4,
                16,
                "седан",
                5);
        System.out.println(passengerCar.getInfo());
        passengerCar.getCharacteristic();
        System.out.println("__________________________________________");
        CargoCar cargoCar = new CargoCar(
                500,
                150,
                7900,
                "Renault",
                6,
                40,
                45);
        System.out.println(cargoCar.getInfo());
        cargoCar.checkCapacity(20);
        cargoCar.checkCapacity(60);
        System.out.println("__________________________________________");
        CivilAirplane civilAirplane = new CivilAirplane(
                5000,
                8000,
                35000,
                "Boeing 747",
                25,
                3000,
                107,
                true);
        System.out.println(civilAirplane.getInfo());
        civilAirplane.checkMaxPassenger(80);
        civilAirplane.checkMaxPassenger(150);
        System.out.println("__________________________________________");
        MilitaryAirplane militaryAirplane = new MilitaryAirplane(
                3200,
                2360,
                30000,
                "Су-27",
                15,
                1500,
                8,
                false);
        MilitaryAirplane militaryAirplane1 = new MilitaryAirplane(
                3200,
                2360,
                30000,
                "Су-30",
                15,
                1500,
                0,
                true);
        System.out.println(militaryAirplane.getInfo());
        System.out.println(militaryAirplane1.getInfo());
        militaryAirplane.shot();
        militaryAirplane1.shot();
        militaryAirplane.checkEjection();
        militaryAirplane1.checkEjection();
    }
}
