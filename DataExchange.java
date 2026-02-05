class DataExchange {
    public static void main(String[] args) {

        int sumi = 25;   
        int nisha = 40;  

        System.out.println("Before Exchange:");
        System.out.println("sumi = " + sumi);
        System.out.println("nisha = " + nisha);
        
        sumi = sumi + nisha;
        nisha = sumi - nisha;
        sumi = sumi - nisha;

        System.out.println("After Exchange:");
        System.out.println("Sumi = " + sumi);
        System.out.println("nisha = " + nisha);
    }
}
