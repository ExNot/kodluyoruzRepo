package Arrays;

public class HarmonicAvg {

    public static void main(String[] args) {
        double avg =0.0;
        int [] list = {2,6,9,3,8,3};
        for (int i =0; i<list.length;i++){

            avg += 1.0/list[i];
            System.out.println(avg);
        }
        System.out.println(list.length/avg);
    }
}

