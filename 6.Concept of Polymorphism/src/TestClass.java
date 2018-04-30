public class TestClass {
    public static void main(String[] args){

        DynamicPolymorphism1 D_Object = new DynamicPolymorphism2();
        D_Object.move();//This prints the statement of the Dynamic Polymorphism 2

        D_Object = new DynamicPolymorphism1();
        D_Object.move(); //This prints the statement of the dynamic polymorphism1

        StaticPolymorphism S_Object = new StaticPolymorphism();

        S_Object.add(34,23);
        S_Object.add(378,639,28);
        S_Object.add(36,78.12);
        S_Object.add(82.292,647);

    }

}