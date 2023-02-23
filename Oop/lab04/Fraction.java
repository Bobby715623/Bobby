
public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public String toFloat(){
        double ans;
        double a = topN;
        double b = btmN;
        ans = a/b ;
        return ""+ans;
    }
    public void addFraction(Fraction f){
    if (btmN == f.btmN){
        topN = topN + f.topN;
    }
    else {
        topN = (topN*f.btmN) + (f.topN*btmN);
        btmN = btmN*f.btmN;
    }
}
}
