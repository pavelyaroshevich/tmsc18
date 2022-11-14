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
        System.out.println("byte \t\t т \t ня \t я \t\t ня \t ня \t ня \t ня \t x ");
        System.out.println("short \t\t я\t т \t\t я \t\t ня \t ня \t ня \t ня \t x");
        System.out.println("char \t\t я \t я \t\t т \t\t ня \t ня \t ня \t ня \t x");
        System.out.println("int \t\t я \t я \t\t я \t\t т \t\t ня \t ня \t ня \t x");
        System.out.println("long \t\t я \t я \t\t я \t\t я \t\t т \t\t ня \t ня \t x");
        System.out.println("float \t\t я \t я \t\t я \t\t я \t\t я \t\t т \t\t ня \t x");
        System.out.println("double \t\t я \t я \t\t я \t\t я \t\t я \t\t я \t\t т \t\t x");
        System.out.println("boolean \t х \t х \t\t х \t\t х \t\t х \t\t х \t\t х \t\t т");
    }
}
