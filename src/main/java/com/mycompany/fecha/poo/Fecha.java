package com.mycompany.fecha.poo;

public class Fecha {
    package com.mycompany.fecha.poo;

public class Fecha {
    // TODO: Aquí va el código de la clase fechas
    public class Fecha {
    
    private int dia;
    private int mes;
    private int anno;
    public Fecha (int dia, int mes, int anno){
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public String fechaCorta(){
       return String.format("%02d/%02d/%04d", dia,mes,anno);
    }
    
    public boolean validarFecha() {
        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        switch (mes) {
            case 2 -> {
                if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
                    if (dia > 29) {
                        return false;
                    }
                    
                } else if (dia > 28) {
                    return false;
                }
            }
            
            case 4, 6, 9, 11 -> {
                if (dia > 30) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public String mesLetra (){
        String[] meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        return meses[mes-1];
    }
    
    public String fechaLarga(){
        return String.format("%d de %s de %d", dia, mesLetra(), anio);
    }
  }
}

}
