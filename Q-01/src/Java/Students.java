package Java;

public class Students {
    private String name;
    private int qtdSolved;
    
    public Students(String name, int qtdSolved){
        super();
        this.name = name;
        this.qtdSolved = qtdSolved;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQtdSolved() {
        return qtdSolved;
    }
    public void setQtdSolved(int qtdSolved) {
        this.qtdSolved = qtdSolved;
    }
}