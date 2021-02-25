public class Main {
    public static void main(String args[]){

        char[] textoJavaEnArregloDeCaracteres = {'J', 'a', 'v', 'a'};

        /* String Builder es más eficiente que String Buffer.
        Ambas clases representan una secuencia de caracteres al igual que String, sin embargo son Mutables. */
        
        // String Builder es no-sincronizado. 
        // No es Thread-safe (No es seguro en el manejo de Hilos)
        // En una aplicación Multi-Hilos (Multi-threaded), 2 hilos pueden llamar a los métodos de forma simultánea.
        StringBuilder tiposDeDatosEnStringBuilder = new StringBuilder("STRING BUILDER: A nuestra Cadena Inicial " +
                "le podemos adjuntar varios tipos de datos: ");

        tiposDeDatosEnStringBuilder.append("\nBoleanos: ");
        tiposDeDatosEnStringBuilder.append(true);
        tiposDeDatosEnStringBuilder.append("\nEnteros: ");
        tiposDeDatosEnStringBuilder.append(10);
        tiposDeDatosEnStringBuilder.append("\nCaracteres: ");
        tiposDeDatosEnStringBuilder.append('a');
        tiposDeDatosEnStringBuilder.append("\nFlotantes: ");
        tiposDeDatosEnStringBuilder.append(20.99);
        tiposDeDatosEnStringBuilder.append("\nCadenas: ");
        tiposDeDatosEnStringBuilder.append("Otra Cadena");

        System.out.println(tiposDeDatosEnStringBuilder);
        System.out.println();

        StringBuilder metodoInsertarEnStringBuilder = new StringBuilder("Podemosen cualquier posición de una Cadena inicial.");
        metodoInsertarEnStringBuilder.insert(7, " Insertar Texto ");
        metodoInsertarEnStringBuilder.append("\nAdemás, podemos insertar un arreglo de Caracteres: ");
        metodoInsertarEnStringBuilder.insert(119, textoJavaEnArregloDeCaracteres, 0, 4);
        System.out.println(metodoInsertarEnStringBuilder);
        System.out.println();
        
        // String Buffer es sincronizado.
        // Es Thread-Safe (Es seguro con el manejo de Hilos)
        // En una aplicación de 2 hilos, 2 hilos no pueden llamar a los métodos de forma simultánea.
        StringBuffer tiposDeDatosEnStringBuffer = new StringBuffer("STRING BUFFER: A nuestra Cadena Inicial " +
                "le podemos adjuntar varios tipos de datos: ");

        tiposDeDatosEnStringBuffer.append("\nBoleanos: ");
        tiposDeDatosEnStringBuffer.append(true);
        tiposDeDatosEnStringBuffer.append("\nEnteros: ");
        tiposDeDatosEnStringBuffer.append(10);
        tiposDeDatosEnStringBuffer.append("\nCaracteres: ");
        tiposDeDatosEnStringBuffer.append('a');
        tiposDeDatosEnStringBuffer.append("\nFlotantes: ");
        tiposDeDatosEnStringBuffer.append(20.99);
        tiposDeDatosEnStringBuffer.append("\nCadenas: ");
        tiposDeDatosEnStringBuffer.append("Otra Cadena");

        System.out.println(tiposDeDatosEnStringBuffer);
        System.out.println();

        StringBuffer metodoInsertarEnStringBuffer = new StringBuffer("Podemosen cualquier posición de una Cadena inicial.");
        metodoInsertarEnStringBuffer.insert(7, " Insertar Texto ");
        metodoInsertarEnStringBuffer.append("\nAdemás, podemos insertar un arreglo de Caracteres: ");
        metodoInsertarEnStringBuffer.insert(119, textoJavaEnArregloDeCaracteres, 0, 4);
        System.out.println(metodoInsertarEnStringBuffer);
        System.out.println();

        // Comparación entre String, StringBuilder y StringBuffer
        System.out.println("COMPARACION ENTRE LAS CLASES STRING, STRINGBUILDER Y STRINGBUFFER:");
        String personalidadInes = new String("Confianza");
        adjuntarNuevoValor(personalidadInes);
        System.out.println("La personalidad de Inés cuenta son las siguientes características: " + personalidadInes);

        StringBuilder personalidadDaniela = new StringBuilder("Confianza");
        adjuntarNuevoValor(personalidadDaniela);
        System.out.println("La personalidad de Daniela cuenta son las siguientes características: " + personalidadDaniela);

        StringBuffer personalidadMariano = new StringBuffer("Confianza");
        adjuntarNuevoValor(personalidadMariano);
        System.out.println("La personalidad de Mariano cuenta son las siguientes características: " + personalidadMariano);
    }

    public static void adjuntarNuevoValor(String personalidadActual) {
        personalidadActual = personalidadActual + " y Empatía";
    }

    public static void adjuntarNuevoValor(StringBuilder personalidadActual){
        personalidadActual.append(" y Empatía");
    }

    public static void adjuntarNuevoValor(StringBuffer personalidadActual){
        personalidadActual.append((" y Empatía"));
    }
}
