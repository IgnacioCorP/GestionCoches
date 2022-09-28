
package test;


public class vehiculo {
  
   public String Matrícula;
   public String Marca; 
   public String Modelo;
   public String Color;
   public Double Tarifa;
   public Boolean Disponible;

    public String getMatrícula() {
        return Matrícula;
    }

    public void setMatrícula(String Matrícula) {
        this.Matrícula = Matrícula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Double getTarifa() {
        return Tarifa;
    }

    public void setTarifa(Double Tarifa) {
        this.Tarifa = Tarifa;
    }

    public Boolean getDisponible() {
        return Disponible;
    }

    public void setDisponible(Boolean Disponible) {
        this.Disponible = Disponible;
    }

    public vehiculo(String Matrícula, String Marca, String Modelo, String Color, Double Tarifa, Boolean Disponible) {
        this.Matrícula = Matrícula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Tarifa = Tarifa;
        this.Disponible = Disponible;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "Matr\u00edcula=" + Matrícula + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Tarifa=" + Tarifa + ", Disponible=" + Disponible + '}';
    }
   
   
}
