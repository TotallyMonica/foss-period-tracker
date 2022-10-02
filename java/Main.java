public class Main {
    public static void main(String[] args) {
    	Planning cyc1 = new Planning();
    	
    	System.out.println("-----Debug-----");
    	System.out.println(cyc1.hasStarted());
    	System.out.println(cyc1.isStarting());
    	System.out.println(cyc1.getRange());
    	System.out.println(cyc1.getLength());
    	System.out.println(cyc1.getStart());
    	System.out.println("-----End Debug-----\n");
    	
    	cyc1.setRange(4);
    	System.out.println(cyc1.hasStarted());
    	System.out.println(cyc1.isStarting());
    	
    	cyc1.start();
    	System.out.println(cyc1.hasStarted());
    }
}