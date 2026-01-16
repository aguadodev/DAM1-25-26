package ud3.strings;

public class EP0601_Comentarios {

    public static String eliminaComentarios(String codigo) {
        int contComentarios = 0;

        int posInicioComentario = codigo.indexOf("/*");
        while (posInicioComentario != -1) {
            contComentarios++;
            // Proceso el comentario
            int posFinComentario = codigo.indexOf("*/", posInicioComentario);
            // Eliminar comentario???
            codigo = codigo.substring(0, posInicioComentario) + 
                     codigo.substring(posFinComentario + 2, codigo.length());

            posInicioComentario = codigo.indexOf("/*");
        }

        System.out.println("El código tiene " + contComentarios + " bloques de comentarios.");

        return codigo;
    }




    public static void main(String[] args) {
        String codigo = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
        System.out.println(eliminaComentarios(codigo)); // "if (a==3)  a++;"
    }
}
