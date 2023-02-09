public class NoteBook {
    public int Id;
    public String brand;
    public String model;
    public int RAM;
    public int HD;
    public String OS;
    public String color;
    public int cost;

    public NoteBook(int id, String brand, String model,
            int RAM, int HD, String OS, String color, int cost) {
        Id = id;
        this.brand = brand;
        this.model = model;
        this.RAM = RAM;
        this.HD = HD;
        this.OS = OS;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {

        return brand + " " + model + " " + "\nOS: " + OS + "\nRAM = " + RAM +
                "GB, HD = " + HD + "GB" + "\ncolor: " + color + "\ncost: " + cost + "rub";
    }

}