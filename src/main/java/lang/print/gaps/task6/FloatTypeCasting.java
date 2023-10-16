package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int number=(int)numberToBeRounded;
        System.out.println(number);

    }

    public static void main(String[] args) {
        FloatTypeCasting obj = new FloatTypeCasting();
        obj.roundNumber(55.9f);
    }
}
