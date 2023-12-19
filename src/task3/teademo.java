package task3;

public class teademo {
	
	public static void main(String[] args) {
        // Create an array of Tea objects
        Tea[] teas = new Tea[4];

        // Populate the array with instances of Tea and its subclasses
        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();
        teas[3] = new HerbalTea();

        // Iterate through the array and invoke prepareTea for each object
        for (Tea tea : teas) {
            tea.prepareTea();
            System.out.println();  // Separate each tea preparation
        }
    }
}


class BlackTea2 extends Tea {
    public BlackTea2() {
        this.hotWater = true;
        this.teaLeaves = true;
    }

    @Override
    public void prepareTea() {
        System.out.println("Preparing Black Tea:");
        super.prepareTea();
        System.out.println("Brewing for 5 minutes");
    }
}

class GreenTea2 extends Tea {
    public GreenTea2() {
        this.hotWater = true;
        this.teaLeaves = true;
    }

    @Override
    public void prepareTea() {
        System.out.println("Preparing Green Tea:");
        super.prepareTea();
        System.out.println("Brewing for 3 minutes");
    }
}

class HerbalTea2 extends Tea {
    public HerbalTea2() {
        this.hotWater = true;
        this.teaLeaves = false;
    }

    @Override
    public void prepareTea() {
        System.out.println("Preparing Herbal Tea:");
        super.prepareTea();
        System.out.println("Brewing for 7 minutes");
    }
}
