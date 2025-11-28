public class Main{
    public static void main(String[] args){
        long[] s = new long[14];
        int k = 0;
        for (int i = 6; i<=19; i++){
            s[k] = i;
            k++;
        }
        float[] x = new float[15];
        for (int i=0; i<15; i++){
            x[i] = (float)(Math.random() * (11 + 6)) - 6;
        }
        double[][] s1 = new double[14][15];
        for (int i = 0; i<14; i++){
            switch ((int)s[i]) {
                case 17:
                    for (int j = 0; j<15; j++){
                        s1[i][j] = f1(x[j]);
                    }
                    break;
                case 9, 11, 12, 14, 15, 16, 18:
                    for (int j = 0; j<15; j++){
                        s1[i][j] = f2(x[j]);
                    }
                    break;
                case 6, 7, 8, 10, 13, 19:
                    for (int j = 0; j<15; j++){
                        s1[i][j] = f3(x[j]);
                    }
                    break;
            }
        }
        for (int i =0; i<14; i++){
            for (int j=0; j<15; j++) {
                System.out.print(String.format("%,.4f", s1[i][j]) + ", ");
            }
            System.out.println();
        }
    }
    public static float f1(float x){
        return (float)(Math.asin((float)2/3 * 0.2 * (float)(x+2.5)/17));
    }
    public static float f2(float x){
        return (float)(Math.pow(Math.asin((float)(x+2.5)/17), (float)1/3) * ((float)1/2 - Math.pow(Math.tan(x), (float)1/3)));
    }
    public static float f3(float x){
        return (float)(Math.log(Math.pow(Math.sin(Math.pow(Math.E, (float)x/9)), 2)));
    }
}