public class naga extends Musuh{
    public naga(){
        super("naga laut",500);

    }
    @Override
    public void serangpemain(){
        System.out.println(this.namaMusuh + "naga menyemburkan air laut asin ! hp player -50");
    }

    @Override
    public void Bersuara(){
        System.out.println(this.namaMusuh + "naga bersuara = hahahah " );
    }
}