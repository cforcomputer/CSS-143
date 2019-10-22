public class Ex20 {
    public static void main(String[] args)
    {
        Character characterObject1 = new Character('a');
        Character characterObject2 = new Character('A');
        if (characterObject1.equals(characterObject2))
            System.out.println("Objects are equal");
        else
            System.out.println("Objects are Not equal.");
    }
}
