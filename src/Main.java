//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        LinkedListCreator list22 = new LinkedListCreator();
        LinkedListCreator list23 = new LinkedListCreator();
        LinkedListCreator list24 = new LinkedListCreator();

        //LIST 22
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

        //LIST23
        list23.add(82);
        list23.add(92);
        list23.add(12);
        list23.add(4);
        list23.add(4);
        list23.add(216);
        list23.add(1432);
        list23.add(134);
        list23.add(39);
        list23.add(12303);

        System.out.println(list23);
            list23.changeLastNodeValue();
        System.out.println(list23);




    }
}