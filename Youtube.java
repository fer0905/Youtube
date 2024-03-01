public class Youtube {
    public static void main(String[] args) {
        Usuario usu1 = new Usuario("Maria Fernanda");
        Video vid1= new Video (6000,"¿Como poder derivar?","Https://youtube.com/v0001");
        usu1.SubirVideo(vid1);
        usu1.MostrarInfoUsuario();
        System.out.println("---");
        
        Usuario usu2 = new Usuario ("Diaz Espinoza");
        Comentario commt1 = new Comentario("Es informativo tu video", usu2);
        
        System.out.println("El usuario: " + usu2.getNombre() + "    Realizo el comentario: " + commt1.getContenido());
               
    }
}