public enum Dias {
/*pueden tener atributos */
//los asignan como se ve acontinuación
//pueden tener 0 o n cantidad de atributos
//los que ustedes necesiten
    LUNES(1,"lunes"),
    MARTES(2,"martes"),
    MIERCOLES(3,"miercoles"),
    JUEVES(4,"jueves"),
    VIERNES(5,"viernes"),
    SABADO(6,"sabado"),
    DOMINGO(7,"domingo");

    //deben de escribir la visibildad, tipo y nombre
    private int numDia;
    private String nombreDia;

    //si tienen atributos necesitan un contructor
    //el enum DiasSimple no tiene, porque no posee atributos
    private Dias (int numDia, String nombreDia){
        this.numDia = numDia;
        this.nombreDia = nombreDia;
    }

    //y si crean atributos 
    //necesitan obtenerlos por medio de getters
    public int getNumDia(){
        return this.numDia;
    }
    
    public String getNombreDia (){
        return this.nombreDia;
    }

}
