public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        String myName;
//        int myAge;
//        float myTemp;
//        char myGrade;
//        boolean myJava;
//        myName = "Karta";
//        myAge = 22;
//        myTemp = 36.20f;
//        myGrade = 'A';
//        myJava = false;
//
//        System.out.println(myName);
//        System.out.println(myAge);
//        System.out.println(myTemp);
//        System.out.println(myGrade);
//        System.out.println(myJava);
//
        // Luas Lingkaran
//        final double myPhi;
//        int r1;
//        int r2;
//        double L1;
//        double L2;
//        myPhi = Math.PI;
//        r1 = 10;
//        r2 = 15;
//        L1 = myPhi * (r1 * r1);
//        L2 = myPhi * (r2 * r2);
//
//        System.out.println("Luas Lingkaran dengan r = 10 adalah "+L1);
//        System.out.println("Luas Lingkaran dengan r = 15 adalah "+L2);
//
//        //Bilangan Ganjil Genap
//        int result = (60 % 2);
//        System.out.println("60 % 2 = "+result);
//        System.out.println("Genap = "+ true);

        //Relational Operator
//        int myNumber = 5;
//        String Number = "5";
//        boolean result_1 = (myNumber == Number);
//        System.out.println(myNumber == Number);

        //Odd Even Upgrade
//        int myNumber = 47;
//        System.out.println("Nomor anda adalah "+myNumber);
//        if (myNumber > 50) {
//            System.out.println("Angka lebih besar dari 50");
//            if (myNumber % 2 == 0) {
//                System.out.println(("Angka anda merupakan angka genap"));
//            } else if (myNumber % 2 == 1) {
//                System.out.println("Angka anda merupakan ganjil");
//            }
//        } else if (myNumber < 50) {
//            System.out.println("Angka lebih kecil dari 50");
//            if (myNumber % 2 == 0) {
//                System.out.println(("Angka anda merupakan angka genap"));
//            } else if (myNumber % 2 == 1) {
//                System.out.println("Angka anda merupakan ganjil");
//            }
//        }
        //int day = 1;
//        Integer [] day = new Integer[]{1,2,3,5};
//        String dayName;
//        for(Integer num : day){
//            switch (num) {
//                case 1: dayName = "Sunday"; break;
//                case 2: dayName = "Monday"; break;
//                case 3: dayName = "Tuesday"; break;
//                default: dayName = "Invalid day"; break;
//            }
//            System.out.println(dayName);
//        }
//        Integer [] myNumber = new Integer[]{10,75,76,47};
//        String OEName;
//        for(Integer num : myNumber) {
//            switch (num % 2) {
//                case 0:
//                    OEName = "Genap";
//                    break;
//                case 1:
//                    OEName = "Ganjil";
//                    break;
//                default:
//                    OEName = "NaN";
//                    break;
//            }
//            System.out.println("Number = "+num);
//            System.out.println(OEName);
//        }
//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 1){
//                System.out.println(i);
//            } else if (i % 2 == 0) {
//                System.out.println("Even");
//            }
//        }
        int i = 1;
        while (i <= 50) {
            if (i % 2 == 1){
                System.out.println(i);
            } else if (i % 2 == 0) {
                System.out.println("Even");
            }
            i++;
        }
    }
}