package by.it.cherkas.calc;

class Printer {
    public void print(Var var) {
        if (var != null){
            System.out.println(var);
        }
        else {
            System.err.println("Error");
        }
    }
}
