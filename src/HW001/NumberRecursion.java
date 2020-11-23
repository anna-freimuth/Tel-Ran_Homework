package HW001;

class NumberRecursion {

    public int numberRecursion(int number) {
        if (number == 0) return 0;
        return numberRecursion(number - 1) + number + number - 1;
    }
}
