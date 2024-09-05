public class Main {
    public static void main(String[] args) {
        employee myEmployee1 = new employee();
        myEmployee1.name = "Kartadimaja";
        myEmployee1.NPK = "68765";
        myEmployee1.salary = 7200000.00;
        myEmployee1.address = "Cirendeu, Tangerang Selatan";
        myEmployee1.age = 22;
        myEmployee1.sayHello();
        System.out.println("Nama Karyawan = "+myEmployee1.name);
        System.out.println("NPK = " + myEmployee1.NPK);
        System.out.println("Salary = " + myEmployee1.salary);
        System.out.println("Adress = " + myEmployee1.address);
        System.out.println("Age = " + myEmployee1.age);

        employee myEmployee2 = new employee();
        myEmployee2.name = "Zulfikar";
        myEmployee2.NPK = "68764";
        myEmployee2.salary = 7200000.00;
        myEmployee2.address = "Gunungbatu, Bogor";
        myEmployee2.age = 22;
        myEmployee2.sayHello();
        myEmployee1.sayHello();
        System.out.println("Nama Karyawan = "+myEmployee2.name);
        System.out.println("NPK = " + myEmployee2.NPK);
        System.out.println("Salary = " + myEmployee2.salary);
        System.out.println("Adress = " + myEmployee2.address);
        System.out.println("Age = " + myEmployee2.age);

    }
}