package Lmstask;

public class Main {
    public static void main(String[] args) {

//        Срок сдачи : 26.08.2024 / 05:00
//        TransportType деген enum туз. Ичине ар кандай типтеги унааларды жаз. Мисалы: CAR, BUS, TRUCK.
//
//                Enum-дын ичинде бир  метод болсун:
//        public  double calculateTravelCost(double distance);
//        Бул метод транспорттун ар бир түрү үчүн өзүнүн жол баасын эсептеп чыгышы керек.
//
//        (CAR)  Автоунаанын бир километринин баасы $0,1.
//        (BUS)  Автобустун бир километринин баасы $0,05
//        (TRUCK.) Трак үчүн бир километрдин баасы $0,02


        System.out.println(TransportType.CAR+" :    "+TransportType.CAR.calculateTravelCost(200));
        System.out.println(TransportType.BUS+" :    "+   TransportType.BUS.calculateTravelCost(200));
        System.out.println(TransportType.TRUCK+" :  "+TransportType.TRUCK.calculateTravelCost(200));

        System.out.println(".................................");

        // 2 способ Метод Values
        TransportType[] values = TransportType.values();
        for (TransportType value : values) {
            System.out.println("При дистанции 200 км.    = "+value.calculateTravelCost(200));
        }

    }
}
