package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    Solution(Integer i){}
    Solution(Double d){}
    Solution(Float f){}

    protected Solution(Object o) {}
    protected Solution(String s) {}
    protected Solution() {}

    private Solution(double d){}
    private Solution(float f){}
    private Solution(int i){}

    public Solution(short sh){}
    public Solution(char c){}
    public Solution(boolean b){}



}

