package HW001;

class NumberRecursion {


    public int numberRecursion(int number) {
        if (number == 1) return 1;
        return numberRecursion(number - 1) + number + number - 1;
    }
}
