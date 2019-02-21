package app;

public class Driver {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

       /* Person p1 = new Person();
        p1.name = "Pete";
        p1.age = 25;
        p1.eyeColor = "brown";
        p1.gender = "nonbinary";
        p1.nationality = "Italian";*/
        Model jasper =  new Model();  
        Model can = new Model("Can","Aygin",66,(165.93));

        jasper.printDetails();
        can.printDetails();
        System.out.println(can.getWeightKg());
        jasper.setHeight(26, 13);
        jasper.printDetails();

    }


    
}