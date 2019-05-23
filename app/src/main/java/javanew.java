public class javanew
{
    private static String GB;
    private static String kind;
    private static String color;
    private static String ramat;
    private static String mph;
    private static String price;
    private static long _id;

    public javanew()
    {

    }
    public javanew( String kind,String color,String ramat,String mph,String GB,String price)
    {
        this.kind=kind;
        this.color=color;
        this.ramat=ramat;
        this.mph=mph;
        this.GB=GB;
        this.price=price;

    }
    public javanew( String kind,String color,String ramat,String mph,String GB,String price, long _id)
    {
        this.kind=kind;
        this.color=color;
        this.ramat=ramat;
        this.mph=mph;
        this.GB=GB;
        this.price=price;
        this._id=_id;
    }

    public static String getGB() {
        return GB;
    }

    public static String getColor() {
        return color;
    }

    public static String getKind() {
        return kind;
    }

    public static String getMph() {
        return mph;
    }

    public static String getPrice() {
        return price;
    }
    public static long getid() {
        return _id;
    }
    public static String getRamat()
    {
        return ramat;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public void setGB(String GB) {
        this.GB = GB;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRamat(String ramat) {
        this.ramat = ramat;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
