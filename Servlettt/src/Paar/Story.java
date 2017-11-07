package Paar;

public class Story {
    String bir;
    String eki;
    String op;
    String res;
    String ot;
    Story(String _bir,String _eki,String _op,String _res,String _ot){
        bir=_bir;
        eki=_eki;
        op=_op;
        res=_res;
        ot=_ot;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }

    public void setEki(String eki) {
        this.eki = eki;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public String getBir() {
        return bir;

    }

    public String getEki() {
        return eki;
    }

    public String getOp() {
        return op;
    }

    public String getRes() {
        return res;
    }

    public String getOt() {
        return ot;
    }
}
