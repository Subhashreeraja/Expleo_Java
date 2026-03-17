package Collections;

import java.util.*;

// Comparable class (Sort by RAM)
class Mobile1 implements Comparable<Mobile1> {
    private String name;
    private int ram;
    private int price;

    Mobile1(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    // Sort by RAM
    public int compareTo(Mobile1 o) {
        return this.ram - o.ram;
    }
}

// Comparator for Price
class PriceCompare implements Comparator<Mobile1> {
    public int compare(Mobile1 m1, Mobile1 m2) {
        return m1.getPrice() - m2.getPrice();
    }
}

// Comparator for Name
class NameCompare implements Comparator<Mobile1> {
    public int compare(Mobile1 m1, Mobile1 m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

public class Comparator_prac {

    public static void main(String[] args) {

        List<Mobile1> mobileList = new ArrayList<>();

        mobileList.add(new Mobile1("Vivo", 16, 18000));
        mobileList.add(new Mobile1("Oppo", 8, 14000));
        mobileList.add(new Mobile1("Redmi", 4, 12000));

        //  Sort by Price
        System.out.println("Sorted by Price:");
        Collections.sort(mobileList, new PriceCompare());

        System.out.println("Name\tRam\tPrice");
        for (Mobile1 mb : mobileList) {
            System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
        }

        // Sort by RAM
        System.out.println("\nSorted by RAM:");
        Collections.sort(mobileList);

        System.out.println("Name\tRam\tPrice");
        for (Mobile1 mb : mobileList) {
            System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
        }

        //  Sort by Name
        System.out.println("\nSorted by Name:");
        Collections.sort(mobileList, new NameCompare());

        System.out.println("Name\tRam\tPrice");
        for (Mobile1 mb : mobileList) {
            System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
        }
    }
}