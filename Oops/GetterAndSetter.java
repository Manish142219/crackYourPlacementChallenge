public class Test01 {

    // here we are using the setter and the getter

    public static void main(String[] args) {

        // making the object of the pen
        Pen p = new Pen();
        p.setName("Win Xtream"); // here we are setting the name only
        p.setColor("Blue"); // here we are setting the color only

        System.out.println(p.name); // printing the name
        System.out.println(p.color); // printing the color

        // making an object for the BankAccount
        Bankaccount a = new Bankaccount();
        a.setName("Anika");
        a.setPassword("AAshi@123");

        System.out.println(a.name);
        a.setPassword("'Manish'");
        System.out.println(a.getPassword());
    }

}

class Bankaccount {
    String name;
    private String password;

    void setName(String name) {
        this.name = name;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return this.password;
    }
}

class Pen {
    String name;
    String color;

    void setName(String userName) {
        name = userName;
    }

    void setColor(String newColor) {
        color = newColor;

    }

}
