import java.util.Arrays;

public class Task6 {
    //        6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

    //        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
    public static void main(String[] args) {
        String[][] mass1 = {
                {" *", "  ", "  ", "  "},
                {" *", " *", "  ", "  "},
                {" *", " *", " *", "  "},
                {" *", " *", " *", " *"}
        };
        String[][] mass2 = {
                {"  ", "  ", "  ", " *"},
                {"  ", "  ", " *", " *"},
                {"  ", " *", " *", " *"},
                {" *", " *", " *", " *"}
        };
        String[][] mass3 = {
                {" *", " *", " *", " *"},
                {" *", " *", " *", "  "},
                {" *", " *", "  ", "  "},
                {" *", "  ", "  ", "  "}
        };
        String[][] mass4 = {
                {" *", " *", " *", " *"},
                {"  ", " *", " *", " *"},
                {"  ", "  ", " *", " *"},
                {"  ", "  ", "  ", " *"}
        };
        triangle(mass1);
        triangle(mass2);
        triangle(mass3);
        triangle(mass4);
    }
    private static void triangle(String[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
