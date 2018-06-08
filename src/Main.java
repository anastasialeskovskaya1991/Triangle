import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String line;
        double a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

        while (flag) {
            try {
                System.out.println("Введите первую сторону треугольника и нажмите Enter");
                line = br.readLine();
                String result = line.replaceAll( ",|/", ".") ;
                a = Double.parseDouble(result);
                if (a == Double.POSITIVE_INFINITY) {
                    throw new ArithmeticException();
                }
                if (a == 0){
                    throw new GetNullException();
                }
                System.out.println(a);
                System.out.println("Введите вторую сторону треугольника и нажмите Enter");
                line = br.readLine();
                String resultTwo = line.replaceAll( ",|/", ".") ;
                b = Double.parseDouble(resultTwo);
                if (b == Double.POSITIVE_INFINITY) {
                    throw new ArithmeticException();
                }
                if (b == 0){
                    throw new GetNullException();
                }

                System.out.println(b);
                System.out.println("Введите третью сторону треугольника и нажмите Enter");
                line = br.readLine();
                String resultThree = line.replaceAll( ",|/", ".") ;
                c = Double.parseDouble(resultThree);
                if (c == Double.POSITIVE_INFINITY) {
                    throw new ArithmeticException();
                }
                if (c == 0){
                    throw new GetNullException();
                }
                System.out.println(c);
                System.out.println("Введенные стороны: " + a + " / " + b + " / " + c);

                if ((a == b) && (a == c) && (b == c)) {
                    System.out.println("Треугольник является равносторонним");
                }
                if ((a == b) || (a == c) || (b == c)) {
                    System.out.println("Треугольник является равнобедренным");
                }if ((a < 0) || (c < 0) || (b < 0)) {
                    System.out.println("Длинна не может быть отрицательным значением");
                }if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
                    System.out.println("Невозможность построения треугольника");
                    System.out.println("Сумма двух сторон должна быть больше третьей");
                }else {
                    System.out.println("Треугольник является 'обычным'");
                }
                flag = false;
            } catch (IOException e) {
                e.printStackTrace();

            } catch (NumberFormatException e) {
                System.out.println("Неккоректный ввод!");
                System.out.println("Используйте точку ('.') при написании невещественных чисел, избегойте пустого ввода и ввода символов");
            }catch (ArithmeticException e){
                System.out.println("Вы ввели бесконечность, попробуйте еще раз...");
            }catch (GetNullException e){}
        }
    }
}









