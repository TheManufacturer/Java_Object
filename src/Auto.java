public class Auto {
        private String modello;
        private String marca;

        private double cilindrata;
        private String targa;

        public Auto(String modello, String marca,double cilindrata, String targa){
            this.modello= modello;
            this.marca= marca;
            this.cilindrata= cilindrata;
            this.targa=targa;
        }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", cilindrata='" + cilindrata + '\'' +
                ", targa='" + targa + '\'' +
                '}';
    }
}
