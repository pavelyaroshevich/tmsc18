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
                                 byte  short   char    int     long    float   double  boolean
                          byte     т    ня      я      ня       ня       ня     ня       x 
                          short    я    т       я      ня       ня       ня     ня       x
                          char     я    я       т      ня       ня       ня     ня       x
                          int      я    я       я      т        ня       ня     ня       x
                          long     я    я       я      я        т        ня     ня       x
                          float    я    я       я      я        я        т      ня       x
                          double   я    я       я      я        я        я      т        x
                          boolean  х    х       х      х        х        х      х        т
                          
                """;
        System.out.println(s1);
    }
}
