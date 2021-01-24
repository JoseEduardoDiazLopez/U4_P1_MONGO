
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;


public class ConexionAtlas extends MongoClient {
    public ConexionAtlas(MongoClientURI direccionConexion){
        super(direccionConexion);
    }
}
