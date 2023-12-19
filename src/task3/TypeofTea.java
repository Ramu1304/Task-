package task3;

public class TypeofTea {
	
	protected String water = "Water";
    protected String teaLeaves = "Tea Leaves";
    protected String sugar = "Sugar";
    protected String milk = "Milk";

    public void prepareTea() {
        System.out.println("Boiling " + water);
        System.out.println("Adding " + teaLeaves);
        System.out.println("Adding " + sugar);
        System.out.println("Adding " + milk);
        System.out.println("Tea is ready!");
    }
}

class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Black Tea:");
        String water = null;
		System.out.println("Boiling " + water);
        System.out.println("Adding Black Tea Leaves");
        String sugar = null;
		System.out.println("Adding " + sugar);
        System.out.println("Brewing for 5 minutes");
        System.out.println("Tea is ready!");
    }
}

class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Green Tea:");
        String water = null;
		System.out.println("Boiling " + water);
        System.out.println("Adding Green Tea Leaves");
        System.out.println("Brewing for 3 minutes");
        System.out.println("Tea is ready!");
    }
}

class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Herbal Tea:");
        String water = null;
		System.out.println("Boiling " + water);
        System.out.println("Adding Herbal Tea Blend");
        System.out.println("Brewing for 7 minutes");
        System.out.println("Tea is ready!");
    }
}

class TeaExample {
    public static void main(String[] args) {
        BlackTea blackTea = new BlackTea();
        GreenTea greenTea = new GreenTea();
        HerbalTea herbalTea = new HerbalTea();

        blackTea.prepareTea();
        System.out.println();

        greenTea.prepareTea();
        System.out.println();

        herbalTea.prepareTea();
    }
}
