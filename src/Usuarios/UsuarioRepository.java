package Usuarios;
import java.util.HashMap;
import java.util.Map;

public class UsuarioRepository {

    Map<Integer, Usuario> Hashusuarios = new HashMap<>();

    public void adcionaUsarioHash(Usuario usuario){
        Hashusuarios.put(usuario.getIdUsuario(),usuario);
    }

    public Usuario getUsuarioHash(int idUsuario){
        return(Hashusuarios.get(idUsuario));
    }

}
