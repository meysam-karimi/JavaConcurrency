package mygenerics;

public class Pair<M,N> {
    protected M m;
    protected N n;

    private Pair(M m, N n){
        this.m = m;
        this.n = n;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public N getN() {
        return n;
    }

    public void setN(N n) {
        this.n = n;
    }

    public static <M,N>  Pair<M, N> of(M m, N n){
        return new Pair<>(m,n);
    }

    @Override
    public String toString(){
        return "Pair{"+m.toString()+","+n.toString()+"}";
    }
}
