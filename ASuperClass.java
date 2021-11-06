public class ASuperClass {
    //constructor
    public ASuperClass() {
        System.out.println(" In ASuperClass constructor");
    }


    
}

//class subclass
class SubClass extends ASuperClass {
    //constructor
    public SubClass() {
        System.out.println(" In SubClass constructor");
    }
}


//class DemoConstructors
class DemoConstructors {
    public static void main(String[] args) {
        //create an object of subclass
        SubClass child = new SubClass();
    }
}