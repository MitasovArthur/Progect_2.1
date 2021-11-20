public class Address_1 {
    public static void main(String[] args) {
        Address address = new Address(15637,"Country","sity","street","house","apartament");
        System.out.println(address.getIndex());
        System.out.println(address.getCountry());
        System.out.println(address.getSity());
        System.out.println(address.getStreet());
        System.out.println(address.getHouse());
        System.out.println(address.getApartament());
    }
}
