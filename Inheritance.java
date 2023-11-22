import java.util.Scanner;

// Abstract class representing a Medicine
abstract class Medicine
{
    private String name;
    private String manufacturer;

    // Constructor
    public Medicine(String name, String manufacturer)
    {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    // Abstract method to display information about the medicine
    public abstract void displayInfo();

    // Getter methods
    public String getName()
    {
        return name;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }
}

// Subclass extending Medicine - Tablet
class Tablet extends Medicine 
{
    private int dosage;

    // Constructor
    public Tablet(String name, String manufacturer, int dosage) 
    {
        super(name, manufacturer);
        this.dosage = dosage;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() 
    {
        System.out.println("Tablet: " + getName());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Dosage: " + dosage + "mg");
    }
}

// Subclass extending Medicine - Syrup
class Syrup extends Medicine
{
    private String flavour;

    // Constructor
    public Syrup(String name, String manufacturer, String flavour)
    {
        super(name, manufacturer);
        this.flavour = flavour;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() 
    {
        System.out.println("Syrup: " + getName());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Flavour: " + flavour);
    }
}

// Final class - MedicineStore
final class MedicineStore 
{
    // This class cannot be extended since it is 'final'

    // Method to manage and display medicines
    public static void displayMedicineInfo(Medicine medicine)
    {
        medicine.displayInfo();
    }
}

public class Inheritance 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        // Taking user input for Tablet
        System.out.println("Enter details for Tablet:-");
        System.out.print("Name: ");
        String tabletName = sc.nextLine();
        System.out.print("Manufacturer: ");
        String tabletManufacturer = sc.nextLine();
        System.out.print("Dosage (mg): ");
        int tabletDosage = sc.nextInt();

        // Creating a Tablet object
        Tablet tablet = new Tablet(tabletName, tabletManufacturer, tabletDosage);

        // Taking user input for Syrup
        sc.nextLine(); // Consuming the newline character
        System.out.println("\nEnter details for Syrup:");
        System.out.print("Name: ");
        String syrupName = sc.nextLine();
        System.out.print("Manufacturer: ");
        String syrupManufacturer = sc.nextLine();
        System.out.print("Flavour: ");
        String syrupFlavour = sc.nextLine();

        // Creating a Syrup object
        Syrup syrup = new Syrup(syrupName, syrupManufacturer, syrupFlavour);

        // Displaying information using the MedicineStore class
        System.out.println("\nMedicine Information from MedicineStore:\n");
        MedicineStore.displayMedicineInfo(tablet);
        System.out.println();
        MedicineStore.displayMedicineInfo(syrup);

        sc.close();
    }
}