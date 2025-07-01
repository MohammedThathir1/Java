class ImpRobo {
    void talk() {
        System.out.println("Robo is Talking");
    }

    void walk() {
        System.out.println("Robo is Walking");
    }

}

class TeacherRobo extends ImpRobo {
    void talk() {
        System.out.println("TeacherRobo is Talking");
    }
    void see() {
        System.out.println("TeacherRobo is seeing");
    }
}

class WarRobo extends ImpRobo {
    void talk() {
        System.out.println("WarRobo is Talking");
    }
    void see() {
        System.out.println("WarRobo is seeing");
    }
}

class ItRobo extends ImpRobo {
    void talk() {
        System.out.println("ItRobo is Talking");
    }
    void see() {
        System.out.println("ItRobo is seeing");
    }
}

public class Robo {
    public static void main(String[] args) {
        workingRobo(new TeacherRobo(), "TeacherRobo");
        workingRobo(new WarRobo(),"WarRobo");
        workingRobo(new ItRobo(), "ItRobo");
    }

    public static void workingRobo(ImpRobo ir, String name) {
        System.out.println();
        System.out.println("Working Robo: " + name);
        
        ir.talk();
        ir.walk();
        if(ir instanceof TeacherRobo){
            ((TeacherRobo) ir).see();
        }
        else if(ir instanceof WarRobo){
            ((WarRobo) ir).see();
        }
        else {
            ((ItRobo) ir).see();
        }
    }
}
