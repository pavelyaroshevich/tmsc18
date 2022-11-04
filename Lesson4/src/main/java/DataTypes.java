public class DataTypes {
    //5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!//  byte	short	char	int 	long	float	double	boolean//    byte//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn

    public static void main(String[] args) {
        System.out.println("          byte\tshort\tchar\tint \tlong\tfloat\tdouble\tboolean");
        System.out.println("byte\t\tт\tня\t\tя\t\tня\t\tня\t\tня\t\tня\t\tx");
        System.out.println("short\t\tя\tт\t\tя\t\tня\t\tня\t\tня\t\tня\t\tx");
        System.out.println("char\t\tя\tя\t\tт\t\tня\t\tня\t\tня\t\tня\t\tx");
        System.out.println("int\t\t\tя\tя\t\tя\t\tт\t\tня\t\tня\t\tня\t\tx");
        System.out.println("long\t\tя\tя\t\tя\t\tя\t\tт\t\tня\t\tня\t\tx");
        System.out.println("float\t\tя\tя\t\tя\t\tя\t\tя\t\tт\t\tня\t\tx");
        System.out.println("double\t\tя\tя\t\tя\t\tя\t\tя\t\tя\t\tт\t\tx");
        System.out.println("boolean\t\tх\tх\t\tх\t\tх\t\tх\t\tх\t\tх\t\tт");
    }
}
