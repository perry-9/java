package user;

import book.Booklist;
import ioperations.Ioperation;

public abstract class User {
    abstract public int menu();
    public Ioperation[] ioperations;
    public User() {
    }
    public void caozuo(int n, Booklist booklist){
        ioperations[n].work(booklist);
    }
}
