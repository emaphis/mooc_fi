
public class Calculator {
    private Reader reader;
    private int numCalculations;

    public Calculator() {
        this.reader = new Reader();
        this.numCalculations = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
       int[] nums = getNums();
       System.out.println("sum of the values " + (nums[0] + nums[1]));
       System.out.println();
    }

    private void difference() {
       int[] nums = getNums();
       System.out.println("difference of the values " + (nums[0] - nums[1]));
       System.out.println();
    }

    private void product() {
       int[] nums = getNums();
       System.out.println("product of the values " + (nums[0] * nums[1]));
       System.out.println();
    }

    public int[] getNums() {
       int[] nums = new int[2];
       System.out.print("value1: ");
       nums[0] = reader.readInteger();
       System.out.print("value2: ");
       nums[1] = reader.readInteger();
       numCalculations++;
 
       return nums;
    }

    private void statistics() {
        System.out.println("Calculations done " + numCalculations);
    }

}
