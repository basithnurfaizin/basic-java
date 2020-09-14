public class MainMahasiswa {

    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setName("Basith Nurfaizin");
        mahasiswa.setAddress("Cimahi");

        //getName
        String name = mahasiswa.getName();

        //getAddress

        String address = mahasiswa.getAddress();

        System.out.printf(mahasiswa.toString());
    }

}
