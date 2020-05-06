public class task4 {
    public static void main(String[] args) {
        System.out.println(Bessi(10, 7, "hello my name is Bessie and this is my essay"));
        String[] res = split("(())()()");
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
        System.out.println(' ');
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toSnakeCase("helloEdabit"));
        double[] array = {16, 18, 30, 1.8};
        System.out.println(overTime(array));
        System.out.println(BMI("55 kilos", "1.65 meters"));
        System.out.println(bugger(39));
        System.out.println(toStarShorthand("aaabbcc"));
        System.out.println(doesRhyme("\"Sam I Am!", "Green eggs and HAM"));
        System.out.println(trouble(451999277L, 99988899989L));
        System.out.println(countUniqueBooks("$AA$BBCATT$C$$B$", '$'));
    }

    public static String Bessi(int N, int K, String A) {
        String delimeter = " ";
        String res = "";
        int len = 0;
        int a = 0;
        String[] array = A.split(delimeter);
        if (N == array.length) {
            for (int i = 0; i < N; i++) {
                if (array[i].length() <= K - a) {
                    res += array[i] + " ";
                    a += array[i].length();
                } else {
                    res += "\n" + array[i] + " ";
                    a = array[i].length();
                }
            }
            return res;
        } else
            return "ошибка";
    }

    public static String[] split(String A) {
        String res[] = new String[A.length() / 2 + 1];
        int cl = 0, op = 0, k = 0;
        for (int j = 0; j < res.length; j++)
            res[j] = "";
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(')
                op += 1;
            if (A.charAt(i) == ')')
                cl += 1;
            if (op != cl)
                res[k] = res[k] + A.charAt(i);
            if (op == cl) {
                res[k] = res[k] + A.charAt(i);
                k += 1;
                op = 0;
                cl = 0;
            }
        }
        return (res);
    }

    public static String toCamelCase(String A) {
        String A1 = "";
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != '_')
                A1 += A.charAt(i);
            if (A.charAt(i) == '_') {
                i++;
                String b = Character.toString(A.charAt(i));
                A1 += b.toUpperCase();
            }
        }
        return A1;
    }

    public static String toSnakeCase(String A) {
        String A1 = "";
        for (int i = 0; i < A.length(); i++) {
            if ((A.charAt(i) >= 'A') && (A.charAt(i) <= 'Z')) {
                A1 += '_';
                String b = Character.toString(A.charAt(i));
                A1 += b.toLowerCase();
            } else
                A1 += A.charAt(i);
        }
        return A1;
    }

    public static String overTime(double[] array) {
        double sum = 0.00;
        if (array[1] <= 17)
            sum += (array[1] - array[0]) * array[2];
        else
            sum += ((17 - array[0]) * array[2]) + ((array[1] - 17) * array[2] * array[3]);

        return "$" + String.format("%.2f", sum);
    }

    public static String BMI(String A, String B) {
        String v = "", r = "", m1 = "", m2 = "";
        double index = 0;
        for (int i = 0; i < A.length(); i++) {
            if (((A.charAt(i) >= '0') && (A.charAt(i) <= '9')) || (A.charAt(i) == '.'))
                v += A.charAt(i);
            else if (A.charAt(i) != ' ')
                m1 += A.charAt(i);
        }
        for (int i = 0; i < B.length(); i++) {
            if (((B.charAt(i) >= '0') && (B.charAt(i) <= '9')) || (B.charAt(i) == '.'))
                r += B.charAt(i);
            else if (B.charAt(i) != ' ')
                m2 += B.charAt(i);
        }
        double V = Double.parseDouble(v);
        double R = Double.parseDouble(r);
        if (m1.equals("pounds"))
            V *= 0.453592;
        if (m2.equals("inches"))
            R *= 0.0254;
        index = V / (R * R);
        if (index <= 18.5)
            return String.format("%.1f", index) + " Underweight";
        else if (index >= 25)
            return String.format("%.1f", index) + " Overweight";
        else
            return String.format("%.1f", index) + " Normal weight";
    }

    public static int bugger(int N) {
        String a = Integer.toString(N);
        int k = 0;
        while (a.length() > 1) {
            int pr = 1;
            for (int i = 0; i < a.length(); i++) {
                pr *= Character.getNumericValue(a.charAt(i));
            }
            k += 1;
            a = Integer.toString(pr);
        }
        return k;
    }

    public static String toStarShorthand(String a) {
        int k = 1;
        String res = "";
        if (a.length() == 0)
            return "";
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i + 1) == a.charAt(i))
                k++;
            else {
                if (k > 1)
                    res += a.charAt(i) + "*" + k;
                else
                    res += a.charAt(i);
                k = 1;
            }
        }
        if (k > 1)
            res += a.charAt(a.length() - 1) + "*" + k;
        else
            res += a.charAt(a.length() - 1);
        k = 1;
        return res;
    }
    public static boolean doesRhyme (String A, String B)
   {
       String a = "";
       String b = "";
        for (int i = A.length()-1; i > 0; i--) {
            if (A.charAt(i) != ' ') {
                if ((A.charAt(i) == 'A') || (A.charAt(i) == 'a') || (A.charAt(i) == 'E') || (A.charAt(i) == 'e') || (A.charAt(i) == 'i') || (A.charAt(i) == 'I') || (A.charAt(i) == 'o') || (A.charAt(i) == 'O') || (A.charAt(i) == 'u') || (A.charAt(i) == 'U') || (A.charAt(i) == 'y') || (A.charAt(i) == 'Y'))
                    a += A.charAt(i);
            }
            if (A.charAt(i) == ' ')
                i = 0;
        }
        for (int i = B.length()-1; i > 0; i--) {
            if (B.charAt(i) != ' ') {
                if ((B.charAt(i) == 'A') || (B.charAt(i) == 'a') || (B.charAt(i) == 'E') || (B.charAt(i) == 'e') || (B.charAt(i) == 'i') || (B.charAt(i) == 'I') || (B.charAt(i) == 'o') || (B.charAt(i) == 'O') || (B.charAt(i) == 'u') || (B.charAt(i) == 'U') || (B.charAt(i) == 'y') || (B.charAt(i) == 'Y')) {
                    b += B.charAt(i);
                }
            }
            if (B.charAt(i) == ' ')
                i = 0;
       }
       b = b.toLowerCase();
       a = a.toLowerCase();
        if (a.equals(b))
            return true;
        else
            return false;
    }
    public static boolean trouble(long Aa, long Bb) {
        String a = Long.toString(Aa);
        String b = Long.toString(Bb);
        char cA = '.', cB = ' ';
        for (int i = 0; i < a.length()-2; i++){
            if (a.charAt(i) == a.charAt(i+1) && (a.charAt(i) == a.charAt(i+2)))
                cA = a.charAt(i);
        }
        for (int i = 0; i < b.length()-1; i++){
            if (b.charAt(i) == b.charAt(i+1)  && (b.charAt(i) == cA))
                cB = b.charAt(i);
    }
        if (cB == cA)
            return true;
        else
            return false;
    }
    public static int countUniqueBooks(String A, char N){
        String res = "";
        boolean open = false;
        for (int i = 0; i < A.length(); i++) {
            int s = 0;
            if (A.charAt(i) == N) {
                if (open == true)
                    open = false;
                else
                    open = true;
            }
            else if (A.charAt(i) != N) {
                if (open == true) {
                    if (res.length() == 0)
                        res += A.charAt(i);
                    else {
                        for (int j = 0; j < res.length(); j++) {
                            if (A.charAt(i) == res.charAt(j))
                                s++;
                        }
                        if (s == 0)
                            res += A.charAt(i);
                    }
                }
            }
        }
            return res.length();
    }
}

