package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

        int num = dividend / divider ;

        if (num*divider==dividend){

            System.out.println("can be divided completely");

        }else{

            System.out.println("cannot be divided completely");

        }

    }
}
