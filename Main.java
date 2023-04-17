package Ejercicio5;

public class Main {
    static CocheCRUDImp cocheCrud = new CocheCRUDImp();
    public static void main(String[] args){

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.load();
    }
}
