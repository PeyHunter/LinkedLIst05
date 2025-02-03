//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        LinkedListCreator list22 = new LinkedListCreator();


        list22.add(23);
        list22.add(2);
        list22.add(22);
        list22.add(294);
        list22.add(9547);
        list22.add(276);
        list22.add(11);
        list22.add(4);
        list22.add(98);
        list22.add(837);

        System.out.println(list22);

        list22.updateAllNodes(); 


        System.out.println(list22);




    }
}