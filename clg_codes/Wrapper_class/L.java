package clg_codes.Wrapper_class;
public class L {
    public static void main(String[] args) {
        int a = 12;
        Integer intval = Integer.valueOf(a); //primitive to object
        System.out.println(intval);
        int i = intval.intValue(); //object to primitive
        System.out.println(i); 
        double d = 12.34;
        Double doubleval = Double.valueOf(d);
        System.out.println(doubleval);
        double d1 = doubleval.doubleValue();
        System.out.println(d1);
        long l = 12313132132l;
        Long longval = Long.valueOf(l);
        long lo = longval.longValue();
    }
}
