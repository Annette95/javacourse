package hr;

public class Run {

    public static void main (String[] args){
        Employee dev = new Dev("Ann","an","senior");
        Employee qa = new QA("kris","tom","junior");

        System.out.println(dev);
        System.out.println(qa);

        Print printQA = new QA("anna","toma","qaqaqaqa");
        Print printDev= new Dev("mkvnd","bcjdbc","devdev");

        printDev.print();
        printQA.print();

    }
}
