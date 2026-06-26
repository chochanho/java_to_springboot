package exam.math;

public class Math {
    private Math (){}
    static int count;
    static void sum(int[] array){
        for(int s: array){
            count += s;
        }

        System.out.println("합계: "+ count);
        count =0;

    } static void average(int[] array){
        float a;
        for(int s: array){
            count += s;

        }
        a = (float) count / array.length;

        System.out.println("합계: "+ a);
        count =0;

    }


    static void min(int[] array){
        count = array[1];
        for(int s: array){
            if(count >s){
                count =s;
            }
        }

        System.out.println("최솟값: "+ count);
        count =0;

    }
    static void max(int[] array){
        for(int s: array){
            if(count<s){
                count = s;
            }
        }

        System.out.println("최대값: "+ count);
        count =0;

    }

}
