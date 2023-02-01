import compiltime.New;
import myth.Chimera;
import myth.Dragon;
import myth.MythicalAnimal;
import runtime.Next;
import runtime.Precedence;

public class Main {
    public static void main(String[] args) {
        New Instance1 = new New();
        New Instance2 = new New(1, 2, 3);
        New Instance3 = new New(0.1f, 0.2f, 0.3f);
        New Instance4 = new New("1", "2", "3");

        // полиморфизм рантайма основывается на двух принципах:
        // 1. ссылочная переменная суперкласса (родительского) ссылается на любой объект наследник (подкласс)
        // 2. метод суперкласса (родительского) может быть переписан в подклассе.
        Precedence precedenceInstance = new Precedence(1, 2, 3);
        Next nextInstance = new Next(1, 2, 3);
        Precedence mixInstance = new Next(10, 2, 3);

        System.out.println(precedenceInstance.calculate(4, 5, 6));
        System.out.println(nextInstance.calculate(4, 5, 6));
        System.out.println(mixInstance.calculate(7, 8, 9));
        // package myth
        MythicalAnimal chimera = new Chimera();
        MythicalAnimal dragon = new Dragon();
        MythicalAnimal animal = new MythicalAnimal();

        chimera.hello();
        dragon.hello();
        animal.hello();
    }
}