package oops.objectclass;

public class Computer {

    int ram;
    String process;
    final int monitorCount;
    static final String COMPUTER_NAME = "Computer";

    public Computer(int ram, String process, int monitorCount) {
        this.ram = ram;
        this.process = process;
        this.monitorCount = monitorCount;
//        this.monitorCount = 10;
    }

    void display() {
        System.out.println(ram);
        System.out.println(process);
    }

//    @Override
//    public String toString() {
//        return "Ram: "+ram+"\n"+"Process: "+process;
//    }


    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", process='" + process + '\'' +
                '}';
    }
}
