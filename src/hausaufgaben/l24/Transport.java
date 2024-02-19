package hausaufgaben.l24;


public class Transport {
    protected String colour;
    protected String brand;
    protected int age;

    public Transport(String colour, String brand, int age) {
        this.colour = colour;
        this.brand = brand;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Transport transport = (Transport) obj;
        return  (colour == null ? transport.colour == null : colour.equals(transport.colour)) &&
                (brand == null ? transport.brand == null : brand.equals(transport.brand)) &&
                age == transport.age;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 13 * result + age;
        return result;
    }

}
