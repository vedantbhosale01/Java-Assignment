public class Question_12 {
    public static void main(String[] args) {
        printable s1 = new CktPlayer(10, "Mindcraft");
        s1.printDetails();

        printable s2 = new FtPlayer("vedant", 20);
        s2.printDetails();
    }
}

 interface printable {

    public void printDetails();
    
} 

class CktPlayer implements printable{

    int runs;
    String name;

    public CktPlayer(int runs, String name){
        this.runs = runs;
        this.name = name;
    }

    @Override
    public void printDetails() {
        System.out.println("Runs: " + runs + " name: " + name);
    }
    
}

class FtPlayer implements printable{

    String name;
    int goals;

    public FtPlayer(String name, int goals){
        this.name = name;
        this.goals = goals;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name + " Goals: " + goals);
    }
    
}
