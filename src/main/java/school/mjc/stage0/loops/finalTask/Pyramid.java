package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int p,res = 1;
        String space = " ";
        for(int i=1; i<=cathetusLength; i++){
            p=i;
            for(int j=1; j<=cathetusLength-i; j++)
                System.out.print(" ");
            for(int k=1; k<=2*i-1; k++){
                System.out.print(p);
                if(k==i)
                    res=0;
                if(res==1)
                    p--;
                else
                    p++;
            }
            res=1;
            System.out.print(space.repeat(cathetusLength-i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
