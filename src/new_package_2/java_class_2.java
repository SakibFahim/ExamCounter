package new_package_2;

public class java_class_2 {
    string abc;
    int ID;


    string name;
    int roll;

    public java_class_2(string abc, int ID, string name, int roll) {
        this.abc = abc;
        this.ID = ID;
        this.name = name;

        this.roll = roll;
    }

    public string getAbc() {
        return abc;
    }

    public void setAbc(string abc) {
        this.abc = abc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
