public class RumusNomor4 extends InputNomor4 {

    public double Kel, Lu, Jar;   

    //Keliling
    public double searchKeliling() {

        Jar = this.Jari;
        Kel = this.Kel;
        Lu = this.Lu;

        //Rumus Mencari Keliling
        Kel = 2 * phi * Jar;
    

        //Print Nilai Keliling
        System.out.println ("Nilai Keliling : " +this.Kel);
        return this.Kel;

        //LUAS
    }
        public double searchLuas() {

            Jar = this.Jari;
            Kel = this.Kel;
            Lu = this.Lu;
    
            //Rumus Mencari Luas
            Lu = phi * Jar * Jar;
        
    
            //Print Nilai Luas
            System.out.println ("Nilai Luas : " +this.Lu);
            return this.Lu;
        
}
}