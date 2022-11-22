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
        String s1 = """
                          byte\tshort\tchar\tint \tlong\tfloat\tdouble\tboolean
                          byte \t\t т \t ня \t я \t\t ня \t ня \t ня \t ня \t x 
                          short \t я\t т \t\t я \t\t ня \t ня \t ня \t ня \t x
                          char \t\t я \t я \t\t т \t\t ня \t ня \t ня \t ня \t x
                          int \t\t я \t я \t\t я \t\t т \t\t ня \t ня \t ня \t x
                          long \t\t я \t я \t\t я \t\t я \t\t т \t\t ня \t ня \t x
                          float \t я \t я \t\t я \t\t я \t\t я \t\t т \t\t ня \t x
                          double \t я \t я \t\t я \t\t я \t\t я \t\t я \t\t т \t\t x
                          boolean \t х \t х \t\t х \t\t х \t\t х \t\t х \t\t х \t\t т
                          
                """;
        System.out.println(s1);
    }
}
