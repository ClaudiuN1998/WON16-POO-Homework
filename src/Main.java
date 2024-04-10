public class Main {
    public static void main(String[] args) {

        System.out.println("Homework");
//exercitiile 1-2
        Person a = new Person();
        a.name = "Andrei Ionescu";
        a.age = 25;
        a.married = "casatorit";

        System.out.print(a.getName() + "; ");
        System.out.print(a.getAge() + " de ani; ");
        System.out.println(a.isMarried() + ";");

        Person b = new Person();
        b.name = "Marius Popescu";
        b.age = 35;
        b.married = "necasatorit";

        System.out.print(b.getName() + "; ");
        System.out.print(b.getAge() + " de ani; ");
        System.out.println(b.isMarried() + ";");

        Person c = new Person();
        c.name = "Constantin Vasilescu";
        c.age = 45;
        c.married = "casatorit";

        System.out.print(c.getName() + "; ");
        System.out.print(c.getAge() + " de ani; ");
        System.out.println(c.isMarried() + ";");
        //}
//exercitiile 3-4
        Product d = new Product();
        d.nameProduct = "zzz";
        d.priceProduct = 25;
        d.quantityProduct = 3;
        d.categoryOfProduct = "xxx";

        System.out.print(d.getName() + "; ");
        System.out.print(d.getPrice() + "; ");
        System.out.print(d.getQuantity() + "; ");
        System.out.print(d.getCategory() + "; ");
        System.out.print(d.hasStock() + "; ");


        Product e = new Product();
        e.nameProduct = "sss";
        e.priceProduct = 33;
        e.quantityProduct = 5;
        e.categoryOfProduct = "xxx";

        System.out.print(e.getName() + "; ");
        System.out.print(e.getPrice() + "; ");
        System.out.print(e.getQuantity() + "; ");
        System.out.print(e.getCategory() + "; ");
        System.out.print(e.hasStock() + "; ");


        Product f = new Product();
        f.nameProduct = "zzz";
        f.priceProduct = 30;
        f.quantityProduct = 9;
        f.categoryOfProduct = "xxx";

        System.out.print(f.getName() + "; ");
        System.out.print(f.getPrice() + "; ");
        System.out.print(f.getQuantity() + "; ");
        System.out.print(f.getCategory() + "; ");
        System.out.print(f.hasStock() + "; ");

    }
}