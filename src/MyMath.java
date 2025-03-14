class MyMath {
    static int sum(int... numbers) {
        int summa = 0;
        for (int i : numbers) {
            summa += i;
        }
        return summa;
    }
}
