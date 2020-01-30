package com.Sneha.cw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CompanyCollections {

    static String input = "abcd";

    public static void main(String[] args) {

        Scanner inputScan = new Scanner(System.in);
        process(inputScan);

        while (!input.equals("E")) {
            System.out.println("Processing again !!");
            process(inputScan);
        }

    }

    private static void process(Scanner inputScan) {
        System.out.println("SELECT : (C)reate, (R)etrieve, (U)pdate, (D)elete, (E)xit");
        String selection = inputScan.nextLine();

        switch (selection) {
        case "C":
            System.out.println("Company Creation - please provide details");

            System.out.println("Company Name : ");
            String name = inputScan.nextLine();

            System.out.println("Company Founder : ");
            String founder = inputScan.nextLine();

            System.out.println("Company Location : ");
            String location = inputScan.nextLine();

            Companyy comp = new Companyy(name, location, founder);
            CompanyOps.createCompany(comp);

            break;

        case "R":
            System.out.println("All Companies ...");
            List<Companyy> comps = CompanyOps.getCompanies();
            for (Companyy company : comps) {
                System.out.println(company);
            }
            break;

        default:
            break;
        }
    }

}

class CompanyOps {
    static Map<Integer, Companyy> companyMap = new HashMap<Integer, Companyy>();

    static boolean createCompany(Companyy comp) {
        int genCompId = (int) (Math.random() * 10000);

        comp.setId(genCompId);
        companyMap.put(genCompId, comp);

        System.out.println("Company created successfully ...");
        return true;
    }

    static List<Companyy> getCompanies() {
        return new ArrayList<Companyy>(companyMap.values());
    }

    static Companyy getCompany(int compId) {
        return companyMap.get(compId);
    }

    static boolean updateCompany(int id, String name, String value) {
        Companyy companyToUpdate = companyMap.get(id);

        if (name.equals("location"))
            companyToUpdate.setLocation(value);
        else
            companyToUpdate.setName(value);

        companyMap.put(id, companyToUpdate);
        return true;
    }

    static boolean deleteCompany(int id) {
        companyMap.remove(id);
        return true;
    }
}

class Companyy {
    int id;
    String name;
    String location;
    String founder;

    public Companyy() {
        super();
    }

    public Companyy(String name, String location, String founder) {
        super();
        this.name = name;
        this.location = location;
        this.founder = founder;
    }

    @Override
    public String toString() {
        return "Company [id=" + id + ", name=" + name + ", location=" + location + ", founder=" + founder + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

}