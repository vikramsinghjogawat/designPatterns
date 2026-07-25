public class AbstractFactoryDemo {
    public static void main(String[] args) {
        //Client code
        String input = "Permanent";
        AbsFactory absFactory2 = switch(input.toUpperCase()){
            case "PERMANENT"-> new PermanentFactory();
            case  "CONTRACT"-> new ContractFacotry();
            default -> throw new IllegalArgumentException("Input incorrect.");
        };
        absFactory2.callLabour().carriesStuff();

        //Summary
        //1.Create Abstract products (Painter,Labour)
        //2.Create Concrete product classes according to Family
                //Families: Permanent,Contract
                //Concrete classes: Permanent Painter, Permanent Labour and Contract Painter, Contract Labour
        //3.Create AbsFactory class that just has methods returning Product interfaces
                //Painter createPainter(), Labour createLabour()
        //4. Family Factory concrete classes that implements AbsFactory gives implementation to
                //those methods and returns those Family Objects in step 2.



    }
}
//create abstract product
interface Painter{
    void paintsHouse();
}
interface Labour{
    void carriesStuff();
}
//Contract 
class ContractPainter implements Painter{

    @Override
    public void paintsHouse() {
        System.out.println("Contractor Painter painting stuff");
    }
}
class ContractLabour implements Labour{

    @Override
    public void carriesStuff() {
        System.out.println("Contractor Labour carrying stuff.");
    }
}

//Permament family
class PermanentPainter implements Painter{

    @Override
    public void paintsHouse() {
        System.out.println("PermanentPainter painting stuff");
    }
}
class PermanentLabour implements Labour{

    @Override
    public void carriesStuff() {
        System.out.println("PermanentLabour carrying stuff");
    }
}

//Create abstract Factory
interface AbsFactory{
    Painter callPainter();
    Labour callLabour();
}

class PermanentFactory implements AbsFactory{

    @Override
    public Painter callPainter() {
        return new PermanentPainter();
    }

    @Override
    public Labour callLabour() {
        return new PermanentLabour();
    }
}
class ContractFacotry implements AbsFactory{

    @Override
    public Painter callPainter() {
        return new ContractPainter();
    }

    @Override
    public Labour callLabour() {
        return new ContractLabour();
    }
}

